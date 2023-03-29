package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.businessscene.query.BusinessSceneCreateDTO;
import com.wakedt.visual.domain.businessscene.businessscene.businessscenecreate.BusinessSceneCreateCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert extends BaseConvert<BusinessSceneCreateDTO, BusinessSceneCreateCmd> {

    BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert.class);
}