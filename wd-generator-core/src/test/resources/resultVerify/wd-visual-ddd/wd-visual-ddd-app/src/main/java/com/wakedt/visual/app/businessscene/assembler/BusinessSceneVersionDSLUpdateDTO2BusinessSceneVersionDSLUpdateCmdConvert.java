package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionDSLUpdateDTO;
import com.wakedt.visual.domain.businessscene.businesssceneversion.dslupdate.BusinessSceneVersionDSLUpdateCmd;
import com.wakedt.visual.domain.businessscene.businesssceneversion.VersionStateConverter;

@Mapper(uses = {
        VersionStateConverter.class,
        JsonConverter.class,
})
public interface BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert extends BaseConvert<BusinessSceneVersionDSLUpdateDTO, BusinessSceneVersionDSLUpdateCmd> {

    BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert.class);
}