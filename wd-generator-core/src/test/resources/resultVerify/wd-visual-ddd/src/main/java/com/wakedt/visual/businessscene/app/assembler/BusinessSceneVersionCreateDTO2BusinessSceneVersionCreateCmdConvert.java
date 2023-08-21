package com.wakedt.visual.businessscene.app.assembler;

import com.wakedt.visual.businessscene.app.cmd.businesssceneversioncreate.BusinessSceneVersionCreateCmd;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionCreateDTO;
import com.wakedt.visual.businessscene.domain.businesssceneversion.VersionStateConverter;
import com.wakedt.visual.businessscene.infrastructure.BaseConvert;
import com.wakedt.visual.businessscene.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert extends BaseConvert<BusinessSceneVersionCreateDTO, BusinessSceneVersionCreateCmd> {

    BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert.class);
}