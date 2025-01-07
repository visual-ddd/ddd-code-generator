package com.wakedt.visual.bizdomain.businessscene.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneRemoveDTO;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneremove.BusinessSceneRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert extends BaseConvert<BusinessSceneRemoveDTO, BusinessSceneRemoveCmd> {

    BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert.class);
}