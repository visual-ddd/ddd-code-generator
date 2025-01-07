package com.wakedt.visual.bizdomain.organization.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.organization.client.request.OrganizationModifyDTO;
import com.wakedt.visual.bizdomain.organization.app.cmd.organizationmodify.OrganizationModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface OrganizationModifyDTO2OrganizationModifyCmdConvert extends BaseConvert<OrganizationModifyDTO, OrganizationModifyCmd> {

    OrganizationModifyDTO2OrganizationModifyCmdConvert INSTANCE = Mappers.getMapper(OrganizationModifyDTO2OrganizationModifyCmdConvert.class);
}