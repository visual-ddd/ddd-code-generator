package com.wakedt.visual.infrastructure.organization.repository;

import com.wakedata.common.core.exception.BizException;
import com.wakedata.common.core.resultcode.CommonResultCode;
import com.wakedt.visual.domain.organization.teammember.TeamMember;
import com.wakedt.visual.domain.organization.teammember.TeamMemberRepository;
import com.wakedt.visual.infrastructure.organization.assembler.TeamMember2TeamMemberDOConvert;
import com.wakedt.visual.infrastructure.organization.repository.mapper.TeamMemberMapper;
import com.wakedt.visual.infrastructure.organization.repository.model.TeamMemberDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * 团队成员-聚合仓储实现类
 *
 * @author shimmer
 * @since 1.0
 */
@Slf4j
@Component
public class TeamMemberRepositoryImpl implements TeamMemberRepository {

    @Resource
    private TeamMemberMapper teamMemberMapper;

    @Override
    public TeamMember save(TeamMember teamMember) {
        TeamMemberDO teamMemberDO = TeamMember2TeamMemberDOConvert.INSTANCE.dto2Do(teamMember);
        int insert = teamMemberMapper.insert(teamMemberDO);
        Assert.isTrue(insert == 1, "插入数据库异常，请联系管理员");
        return TeamMember2TeamMemberDOConvert.INSTANCE.do2Dto(teamMemberDO);
    }

    @Override
    public TeamMember update(TeamMember teamMember) {
        TeamMemberDO teamMemberDO = TeamMember2TeamMemberDOConvert.INSTANCE.dto2Do(teamMember);
        int update = teamMemberMapper.updateById(teamMemberDO);
        Assert.isTrue(update == 1, "更新数据库异常，请联系管理员");
        return TeamMember2TeamMemberDOConvert.INSTANCE.do2Dto(teamMemberDO);
    }

    @Override
    public void remove(TeamMember teamMember) {
        TeamMemberDO teamMemberDO = TeamMember2TeamMemberDOConvert.INSTANCE.dto2Do(teamMember);
        teamMemberMapper.deleteById(teamMemberDO.getId());
    }

    @Override
    public TeamMember find(Long id) {
        TeamMemberDO result = Optional.ofNullable(teamMemberMapper.selectById(id))
                .orElseThrow(() -> new BizException(CommonResultCode.NOT_EXISTS));
        return TeamMember2TeamMemberDOConvert.INSTANCE.do2Dto(result);
    }
}