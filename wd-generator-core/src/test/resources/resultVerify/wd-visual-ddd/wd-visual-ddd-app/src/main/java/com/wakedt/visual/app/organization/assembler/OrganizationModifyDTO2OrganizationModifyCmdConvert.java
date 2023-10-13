package com.wakedt.visual.app.organization.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.organization.query.OrganizationModifyDTO;
import com.wakedt.visual.domain.organization.organization.organizationmodify.OrganizationModifyCmd;

/**
 * OrganizationModifyDTO2OrganizationModifyCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationModifyDTO2OrganizationModifyCmdConvert extends BaseConvert<OrganizationModifyDTO, OrganizationModifyCmd> {

    OrganizationModifyDTO2OrganizationModifyCmdConvert INSTANCE = Mappers.getMapper(OrganizationModifyDTO2OrganizationModifyCmdConvert.class);
}