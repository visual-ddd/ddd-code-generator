package com.wakedt.visual.app.organization.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.organization.query.OrganizationQuery;
import com.wakedt.visual.infrastructure.organization.repository.model.OrganizationDO;
import com.wakedt.visual.infrastructure.organization.repository.mapper.OrganizationMapper;
import com.wakedt.visual.client.organization.dto.OrganizationDTO;
import com.wakedt.visual.app.organization.assembler.OrganizationDTO2OrganizationDOConvert;

/**
 * 查询组织详情-查询器
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
