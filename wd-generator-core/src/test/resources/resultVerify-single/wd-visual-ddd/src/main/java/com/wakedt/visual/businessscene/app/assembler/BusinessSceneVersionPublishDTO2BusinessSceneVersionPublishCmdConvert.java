package com.wakedt.visual.businessscene.app.assembler;

import com.wakedt.visual.businessscene.infrastructure.BaseConvert;
import com.wakedt.visual.businessscene.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionPublishDTO;
import com.wakedt.visual.businessscene.app.cmd.businesssceneversionpublish.BusinessSceneVersionPublishCmd;
import com.wakedt.visual.businessscene.domain.businesssceneversion.VersionStateConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert extends BaseConvert<BusinessSceneVersionPublishDTO, BusinessSceneVersionPublishCmd> {

    BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionPublishDTO2BusinessSceneVersionPublishCmdConvert.class);
}