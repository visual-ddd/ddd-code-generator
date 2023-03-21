package com.wakedt.visual.app.organization.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.client.organization.query.OrganizationInfoByAccountIdQuery;
import com.wakedt.visual.infrastructure.organization.repository.model.OrganizationDO;
import com.wakedt.visual.infrastructure.organization.repository.mapper.OrganizationMapper;
import com.wakedt.visual.client.organization.dto.OrganizationDTO;
import com.wakedt.visual.app.organization.assembler.OrganizationDTO2OrganizationDOConvert;

/**
 * 根据用户查询关联的组织信息列表-查询器
 */
@Component
public class OrganizationInfoByAccountIdQueryExe {

    @Resource
    private OrganizationMapper mapper;

    public ResultDTO<OrganizationDTO> execute(OrganizationInfoByAccountIdQuery query) {
        return ResultDTO.success(
                OrganizationDTO2OrganizationDOConvert.INSTANCE.do2Dto(mapper.organizationInfoByAccountIdQuery(query)));
    }
}
