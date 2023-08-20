package com.wakedt.visual.app.organization.view;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedt.visual.app.organization.assembler.OrganizationDTO2OrganizationDOConvert;
import com.wakedt.visual.client.organization.dto.OrganizationDTO;
import com.wakedt.visual.client.organization.query.OrganizationQuery;
import com.wakedt.visual.infrastructure.organization.repository.mapper.OrganizationMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 组织详情查询对象-查询器
 */
@Component
public class OrganizationQueryExe {

    @Resource
    private OrganizationMapper mapper;

    public ResultDTO<OrganizationDTO> execute(OrganizationQuery query) {
        return ResultDTO.success(
                OrganizationDTO2OrganizationDOConvert.INSTANCE.do2Dto(mapper.organizationQuery(query)));
    }
}
