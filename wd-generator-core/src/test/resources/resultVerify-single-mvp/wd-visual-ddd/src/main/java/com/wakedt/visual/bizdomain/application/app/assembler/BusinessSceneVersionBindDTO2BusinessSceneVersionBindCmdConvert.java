package com.wakedt.visual.bizdomain.application.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.application.client.request.BusinessSceneVersionBindDTO;
import com.wakedt.visual.bizdomain.application.app.cmd.businesssceneversionbind.BusinessSceneVersionBindCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert extends BaseConvert<BusinessSceneVersionBindDTO, BusinessSceneVersionBindCmd> {

    BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert.class);
}