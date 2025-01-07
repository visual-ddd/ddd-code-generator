package com.wakedt.visual.bizdomain.organization.infrastructure.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.domain.organization.Organization;
import com.wakedt.visual.bizdomain.organization.infrastructure.repository.model.OrganizationDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Organization2OrganizationDOConvert extends BaseConvert<Organization, OrganizationDO> {

    Organization2OrganizationDOConvert INSTANCE = Mappers.getMapper(Organization2OrganizationDOConvert.class);

}
