package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.OrganizationManagerBindDTO;
import com.wakedt.visual.domain.organization.organization.organizationmanagerbind.OrganizationManagerBindCmd;

/**
 * OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert extends BaseConvert<OrganizationManagerBindDTO, OrganizationManagerBindCmd> {

    OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert INSTANCE = Mappers.getMapper(OrganizationManagerBindDTO2OrganizationManagerBindCmdConvert.class);
}