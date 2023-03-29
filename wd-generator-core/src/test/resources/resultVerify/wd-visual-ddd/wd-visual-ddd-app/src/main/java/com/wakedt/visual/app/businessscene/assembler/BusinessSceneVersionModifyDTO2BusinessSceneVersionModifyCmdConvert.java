package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionModifyDTO;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionmodify.BusinessSceneVersionModifyCmd;
import com.wakedt.visual.domain.businessscene.businesssceneversion.VersionStateConverter;

@Mapper(uses = {
        VersionStateConverter.class,
        JsonConverter.class,
})
public interface BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert extends BaseConvert<BusinessSceneVersionModifyDTO, BusinessSceneVersionModifyCmd> {

    BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert.class);
}