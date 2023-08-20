package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionPublishDTO;
import com.wakedt.visual.domain.businessscene.businesssceneversion.VersionStateConverter;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionpublish.BusinessSceneVersionPublishCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert extends BaseConvert<BusinessSceneVersionPublishDTO, BusinessSceneVersionPublishCmd> {

    BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert.class);
}