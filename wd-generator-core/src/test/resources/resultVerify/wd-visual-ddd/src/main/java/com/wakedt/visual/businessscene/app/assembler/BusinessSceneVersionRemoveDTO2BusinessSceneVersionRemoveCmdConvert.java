package com.wakedt.visual.businessscene.app.assembler;

import com.wakedt.visual.businessscene.app.cmd.businesssceneversionremove.BusinessSceneVersionRemoveCmd;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionRemoveDTO;
import com.wakedt.visual.businessscene.domain.businesssceneversion.VersionStateConverter;
import com.wakedt.visual.businessscene.infrastructure.BaseConvert;
import com.wakedt.visual.businessscene.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert extends BaseConvert<BusinessSceneVersionRemoveDTO, BusinessSceneVersionRemoveCmd> {

    BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionRemoveDTO2BusinessSceneVersionRemoveCmdConvert.class);
}