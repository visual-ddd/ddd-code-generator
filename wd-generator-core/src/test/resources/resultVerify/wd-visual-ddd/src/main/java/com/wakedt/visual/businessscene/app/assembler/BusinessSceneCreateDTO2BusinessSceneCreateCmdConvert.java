package com.wakedt.visual.businessscene.app.assembler;

import com.wakedt.visual.businessscene.app.cmd.businessscenecreate.BusinessSceneCreateCmd;
import com.wakedt.visual.businessscene.client.query.BusinessSceneCreateDTO;
import com.wakedt.visual.businessscene.infrastructure.BaseConvert;
import com.wakedt.visual.businessscene.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert extends BaseConvert<BusinessSceneCreateDTO, BusinessSceneCreateCmd> {

    BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert.class);
}