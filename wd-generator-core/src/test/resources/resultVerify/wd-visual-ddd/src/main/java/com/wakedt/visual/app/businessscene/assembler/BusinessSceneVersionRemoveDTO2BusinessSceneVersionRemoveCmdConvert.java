package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionRemoveDTO;
import com.wakedt.visual.domain.businessscene.businesssceneversion.VersionStateConverter;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionremove.BusinessSceneVersionRemoveCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert extends BaseConvert<BusinessSceneVersionRemoveDTO, BusinessSceneVersionRemoveCmd> {

    BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert.class);
}