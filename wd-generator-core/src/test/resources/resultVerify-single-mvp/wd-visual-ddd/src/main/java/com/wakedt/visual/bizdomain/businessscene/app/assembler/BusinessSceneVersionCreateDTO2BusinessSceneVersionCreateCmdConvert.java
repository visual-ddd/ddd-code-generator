package com.wakedt.visual.bizdomain.businessscene.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionCreateDTO;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversioncreate.BusinessSceneVersionCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert extends BaseConvert<BusinessSceneVersionCreateDTO, BusinessSceneVersionCreateCmd> {

    BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert.class);
}