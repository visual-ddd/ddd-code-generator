package com.wakedt.visual.businessscene.app.assembler;

import com.wakedt.visual.businessscene.infrastructure.BaseConvert;
import com.wakedt.visual.businessscene.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.businessscene.client.query.BusinessSceneRemoveDTO;
import com.wakedt.visual.businessscene.app.cmd.businesssceneremove.BusinessSceneRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert extends BaseConvert<BusinessSceneRemoveDTO, BusinessSceneRemoveCmd> {

    BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert.class);
}