package com.wakedt.visual.infrastructure.organization.repository;

import com.wakedata.common.core.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.util.Assert;
import com.wakedt.visual.domain.organization.organization.Organization;
import com.wakedt.visual.domain.organization.organization.OrganizationRepository;
import com.wakedt.visual.infrastructure.organization.repository.model.OrganizationDO;
import com.wakedt.visual.infrastructure.organization.repository.mapper.OrganizationMapper;
import com.wakedt.visual.infrastructure.organization.assembler.Organization2OrganizationDOConvert;

/**
 * organization-聚合仓储实现类
 */
@Slf4j
@Component
public class OrganizationRepositoryImpl implements OrganizationRepository {

    @Resource
    private OrganizationMapper organizationMapper;

    @Override
    public Organization save(Organization organization) {
        OrganizationDO organizationDO = Organization2OrganizationDOConvert.INSTANCE.dto2Do(organization);
        int insert = organizationMapper.insert(organizationDO);
        Assert.isTrue(insert == 1, "插入数据库异常，请联系管理员");
        return Organization2OrganizationDOConvert.INSTANCE.do2Dto(organizationDO);
    }

    @Override
    public Organization update(Organization organization) {
        OrganizationDO organizationDO = Organization2OrganizationDOConvert.INSTANCE.dto2Do(organization);
        int update = organizationMapper.updateById(organizationDO);
        Assert.isTrue(update == 1, "更新数据库异常，请联系管理员");
        return Organization2OrganizationDOConvert.INSTANCE.do2Dto(organizationDO);
    }

    @Override
    public void remove(Organization organization) {
        OrganizationDO organizationDO = Organization2OrganizationDOConvert.INSTANCE.dto2Do(organization);
        organizationMapper.deleteById(organizationDO.getId());
    }

    @Override
    public Organization find(Long id) {
        OrganizationDO result = organizationMapper.selectById(id);
        if (result == null) throw new BizException("id不存在!");
        return Organization2OrganizationDOConvert.INSTANCE.do2Dto(result);
    }
}
