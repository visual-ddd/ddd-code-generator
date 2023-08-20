package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionDSLUpdateDTO;
import com.wakedt.visual.domain.businessscene.businesssceneversion.VersionStateConverter;
import com.wakedt.visual.domain.businessscene.businesssceneversion.dslupdate.BusinessSceneVersionDSLUpdateCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert extends BaseConvert<BusinessSceneVersionDSLUpdateDTO, BusinessSceneVersionDSLUpdateCmd> {

    BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert.class);
}