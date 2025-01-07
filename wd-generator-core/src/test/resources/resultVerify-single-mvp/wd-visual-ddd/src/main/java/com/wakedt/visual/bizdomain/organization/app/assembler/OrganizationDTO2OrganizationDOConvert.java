package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.bizdomain.organization.client.response.OrganizationDTO;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.OrganizationDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationDTO2OrganizationDOConvert extends BaseConvert<OrganizationDTO, OrganizationDO> {

    OrganizationDTO2OrganizationDOConvert INSTANCE = Mappers.getMapper(OrganizationDTO2OrganizationDOConvert.class);

}