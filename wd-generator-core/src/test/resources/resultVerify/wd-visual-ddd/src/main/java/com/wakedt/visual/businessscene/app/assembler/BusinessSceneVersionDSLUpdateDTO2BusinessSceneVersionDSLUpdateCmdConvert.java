package com.wakedt.visual.businessscene.app.assembler;

import com.wakedt.visual.businessscene.app.cmd.dslupdate.BusinessSceneVersionDSLUpdateCmd;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionDSLUpdateDTO;
import com.wakedt.visual.businessscene.domain.businesssceneversion.VersionStateConverter;
import com.wakedt.visual.businessscene.infrastructure.BaseConvert;
import com.wakedt.visual.businessscene.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert extends BaseConvert<BusinessSceneVersionDSLUpdateDTO, BusinessSceneVersionDSLUpdateCmd> {

    BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionDSLUpdateDTO2BusinessSceneVersionDSLUpdateCmdConvert.class);
}