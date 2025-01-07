package com.wakedt.visual.bizdomain.businessscene.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionRemoveDTO;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversionremove.BusinessSceneVersionRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert extends BaseConvert<BusinessSceneVersionRemoveDTO, BusinessSceneVersionRemoveCmd> {

    BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert.class);
}