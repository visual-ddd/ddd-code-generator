package com.wakedt.visual.infrastructure.organization.assembler;

import com.wakedt.visual.domain.organization.organization.Organization;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.organization.repository.model.OrganizationDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Organization2OrganizationDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Organization2OrganizationDOConvert extends BaseConvert<Organization, OrganizationDO> {

    Organization2OrganizationDOConvert INSTANCE = Mappers.getMapper(Organization2OrganizationDOConvert.class);

}
