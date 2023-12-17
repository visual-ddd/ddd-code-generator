package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.client.organization.query.OrganizationCreateDTO;
import com.wakedt.visual.domain.organization.organization.organizationcreate.OrganizationCreateCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * OrganizationCreateDTO2OrganizationCreateCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationCreateDTO2OrganizationCreateCmdConvert extends BaseConvert<OrganizationCreateDTO, OrganizationCreateCmd> {

    OrganizationCreateDTO2OrganizationCreateCmdConvert INSTANCE = Mappers.getMapper(OrganizationCreateDTO2OrganizationCreateCmdConvert.class);
}