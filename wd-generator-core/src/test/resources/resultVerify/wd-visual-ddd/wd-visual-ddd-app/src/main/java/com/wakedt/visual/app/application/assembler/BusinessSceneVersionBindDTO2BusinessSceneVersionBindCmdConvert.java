package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.BusinessSceneVersionBindDTO;
import com.wakedt.visual.domain.application.applicationversion.businesssceneversionbind.BusinessSceneVersionBindCmd;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;

@Mapper(uses = {
        VersionStateConverter.class,
        JsonConverter.class,
})
public interface BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert extends BaseConvert<BusinessSceneVersionBindDTO, BusinessSceneVersionBindCmd> {

    BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert.class);
}