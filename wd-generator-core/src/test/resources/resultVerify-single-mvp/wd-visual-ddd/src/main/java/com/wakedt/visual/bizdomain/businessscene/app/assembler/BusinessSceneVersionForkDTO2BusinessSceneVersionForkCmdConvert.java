package com.wakedt.visual.bizdomain.businessscene.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionForkDTO;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversionfork.BusinessSceneVersionForkCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert extends BaseConvert<BusinessSceneVersionForkDTO, BusinessSceneVersionForkCmd> {

    BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert.class);
}