package com.wakedt.visual.bizdomain.businessscene.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.businessscene.client.request.BusinessSceneVersionPublishDTO;
import com.wakedt.visual.bizdomain.businessscene.app.cmd.businesssceneversionpublish.BusinessSceneVersionPublishCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert extends BaseConvert<BusinessSceneVersionPublishDTO, BusinessSceneVersionPublishCmd> {

    BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert.class);
}