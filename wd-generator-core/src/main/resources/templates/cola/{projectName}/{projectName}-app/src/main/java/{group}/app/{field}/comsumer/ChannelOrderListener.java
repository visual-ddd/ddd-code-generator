package com.wakedata.wk.dc.wisdom.manager.channelorder.comsumer;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.LocalDateTimeUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wakedata.common.domainevent.annotation.DomainEventSubscribe;
import com.wakedata.dc.manager.domain.refect.exterior.ExtSysBusinessUnit;
import com.wakedata.dc.manager.domain.refect.exterior.ExteriorDataGateway;
import com.wakedata.dc.user.center.business.api.ProjectChannelIdentityRcpApi;
import com.wakedata.dc.user.center.rule.dto.ProjectChannelIdentityDTO;
import com.wakedata.wk.dc.wisdom.manager.domain.channelorder.channelorder.SignatureInformation;
import com.wakedata.wk.dc.wisdom.manager.domain.channelorder.channelorder.channelordercreate.ChannelOrderCreatedEvent;
import com.wakedata.wk.dc.wisdom.manager.domain.channelorder.channelorder.counseloruserappoint.CounselorUserAppointedEvent;
import com.wakedata.wk.dc.wisdom.manager.domain.channelorder.channelorder.signatureinformationconfirm.RoleSignRuleEnum;
import com.wakedata.wk.dc.wisdom.manager.domain.channelorder.channelorder.signatureinformationconfirm.SignatureInformationConfirmedEvent;
import com.wakedata.wk.dc.wisdom.manager.domain.enums.ReportChannelEnums;
import com.wakedata.wk.dc.wisdom.manager.dto.channelorder.ChannelOrderDTO;
import com.wakedata.wk.dc.wisdom.manager.infrastructure.channelorder.gateway.ChannelOrderGateway;
import com.wakedata.wk.dc.wisdom.manager.infrastructure.channelorder.repository.mapper.ChannelOrderMapper;
import com.wakedata.wk.dc.wisdom.manager.infrastructure.channelorder.repository.model.ChannelOrderDO;
import com.wakedata.wk.dc.wisdom.manager.infrastructure.gatewayimpl.database.mapper.BaseTeamInfoMapper;
import com.wakedata.wk.dc.wisdom.manager.infrastructure.gatewayimpl.database.mapper.MLeadMapper;
import com.wakedata.wk.dc.wisdom.manager.infrastructure.gatewayimpl.database.mapper.SysUserMapper;
import com.wakedata.wk.dc.wisdom.manager.infrastructure.gatewayimpl.database.model.MLead;
import com.wakedata.wk.dc.wisdom.manager.infrastructure.gatewayimpl.database.model.SysUser;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.*;
import java.math.*;
import java.util.Optional;

import static com.wakedata.wk.dc.wisdom.manager.domain.channelorder.channelorder.signatureinformationconfirm.RoleSignRuleEnum.COUNSELOR_USER;

@Component
public class ChannelOrderListener {
    @Resource
    ChannelOrderGateway channelOrderGateway;
    @Resource
    private ChannelOrderMapper channelOrderMapper;
    @Resource
    private MLeadMapper mLeadMapper;
    @Resource
    private BaseTeamInfoMapper baseTeamInfoMapper;
    @DubboReference
    private ProjectChannelIdentityRcpApi projectChannelIdentityRcpApi;
    @Resource
    private ExteriorDataGateway exteriorDataGateway;
    @Resource
    private SysUserMapper sysUserMapper;

    @DomainEventSubscribe(localConsume = true)
    public void listenSignatureInformationConfirmedEvent(SignatureInformationConfirmedEvent e){
        ChannelOrderDTO channelOrderDTO = new ChannelOrderDTO();
        if(isCounselorUser(e.getSignatureInformationList())){
            channelOrderGateway.unLockCounselorUser(
                    channelOrderDTO.getCounselorUserId(),channelOrderDTO.getProjectId());
        }
    }

    private boolean isCounselorUser(List<SignatureInformation> signs){
        for (SignatureInformation sign : signs) {
            if(RoleSignRuleEnum.parseByRoleId(sign.getRoleId()) == COUNSELOR_USER){
                return true;
            }
        }
        return false;
    }

    @DomainEventSubscribe(localConsume = true)
    public void listenCounselorUserAppointedEvent(CounselorUserAppointedEvent event){
        channelOrderGateway.lockCounselorUser(event.getCounselorUserId(),event.getProjectId());
    }

    @DomainEventSubscribe(localConsume = true)
    public void listenChannelOrderCreatedEvent(ChannelOrderCreatedEvent event) {
        //根据线索id查询线索详情
        MLead mLead = mLeadMapper.selectByPrimaryKey(event.getClueId());
        //根据团队id查询团队信息
//        BaseTeamInfo baseTeamInfo = baseTeamInfoMapper.selectByPrimaryKey(mLead.getTeamId());
        //查询二级身份信息
        com.wakedata.common.dto.ResultDTO<ProjectChannelIdentityDTO> channel = projectChannelIdentityRcpApi
                .queryProjectChannelBySecondIndentity(mLead.getProjectId(), Convert.toStr(mLead.getFirstChannelIdentity()));
        ChannelOrderDO channelOrderDO = new ChannelOrderDO();
        //查询项目信息
        ExtSysBusinessUnit extSysBusinessUnit = exteriorDataGateway.selectSysBusinessUnitById(mLead.getProjectId());
        //查询区域信息
        ExtSysBusinessUnit parentExtSysBusinessUnit = exteriorDataGateway.selectSysBusinessUnitById(extSysBusinessUnit.getParentguid());
        //查询带看人身份证信息
        if (mLead.getAppId() == 1002L){
            SysUser sysUser = sysUserMapper.selectOne(new LambdaQueryWrapper<SysUser>().eq(SysUser::getAccountId, mLead.getReferrerAccountId()));
            channelOrderDO.setRecommenderCardId(sysUser.getIdCard());
        }
        if (mLead.getAppId() == 1001L){
            String cardNo = sysUserMapper.selectCardNoByAccountId(mLead.getReferrerAccountId());
            channelOrderDO.setRecommenderCardId(cardNo);
        }
        String channelOrderNo = parentExtSysBusinessUnit.getBuname() + "-" + extSysBusinessUnit.getBuname() + LocalDateTimeUtil.format(LocalDateTime.now(), DatePattern.NORM_DATETIME_FORMATTER);
        channelOrderDO.setId(event.getId());
        channelOrderDO.setChannelPlatformName(mLead.getCounselorName());
        channelOrderDO.setChannelOrderNo(channelOrderNo);
        channelOrderDO.setClueId(mLead.getClueId());
        channelOrderDO.setTeamId(mLead.getTeamId());
        channelOrderDO.setProjectId(mLead.getProjectId());
        channelOrderDO.setFirstLevelIdentity(Convert.toStr(mLead.getFirstChannelIdentity()));
        channelOrderDO.setFirstLevelIdentityName(ReportChannelEnums.getLabelByValue(Long.valueOf(mLead.getFirstChannelIdentity())));
        channelOrderDO.setSecondaryIdentity(mLead.getSecondChannelIdentity());
        channelOrderDO.setSecondaryIdentityName(Optional.ofNullable(channel.getData()).orElse(new ProjectChannelIdentityDTO()).getIdentityName());
        channelOrderDO.setRecommenderId(mLead.getReferrerAccountId());
        channelOrderDO.setRecommenderName(mLead.getReferrerName());
        channelOrderDO.setRecommenderMobile(mLead.getReferrerMobile());
        channelOrderDO.setReportTime(DateUtil.toLocalDateTime(mLead.getCreateTime()));
        channelOrderDO.setCustomerId(mLead.getClueAccountId());
        channelOrderDO.setCustomerName(mLead.getName());
        channelOrderDO.setCustomerMobile(mLead.getMobile());
        channelOrderDO.setCustomerSex(mLead.getGender());
        channelOrderDO.setChannelTapeStatus(1);
        channelOrderDO.setVisitClueStatus(mLead.getValidStatus());
        //更新带看单记录
        channelOrderMapper.updateById(channelOrderDO);
    }

}
