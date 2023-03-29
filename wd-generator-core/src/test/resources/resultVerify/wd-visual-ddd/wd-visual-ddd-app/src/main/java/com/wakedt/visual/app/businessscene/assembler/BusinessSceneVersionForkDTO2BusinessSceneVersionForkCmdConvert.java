package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionForkDTO;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionfork.BusinessSceneVersionForkCmd;
import com.wakedt.visual.domain.businessscene.businesssceneversion.VersionStateConverter;

@Mapper(uses = {
        VersionStateConverter.class,
        JsonConverter.class,
})
public interface BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert extends BaseConvert<BusinessSceneVersionForkDTO, BusinessSceneVersionForkCmd> {

    BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert.class);
}