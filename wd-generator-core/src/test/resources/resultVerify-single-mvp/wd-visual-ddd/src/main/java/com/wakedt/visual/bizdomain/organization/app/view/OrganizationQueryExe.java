package com.wakedt.visual.bizdomain.organization.app.view;

import com.wakedata.common.core.dto.ResultDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationQuery;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.OrganizationDO;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.mapper.OrganizationMapper;
import com.wakedt.visual.bizdomain.organization.client.response.OrganizationDTO;
import com.wakedt.visual.bizdomain.organization.app.assembler.OrganizationDTO2OrganizationDOConvert;

/**
 * 组织详情查询对象-查询器
 *
 * @author visual-ddd
 * @since 1.0
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
