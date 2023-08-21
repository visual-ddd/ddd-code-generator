package com.wakedt.visual.businessscene.app.assembler;

import com.wakedt.visual.businessscene.app.cmd.businesssceneversionfork.BusinessSceneVersionForkCmd;
import com.wakedt.visual.businessscene.client.query.BusinessSceneVersionForkDTO;
import com.wakedt.visual.businessscene.domain.businesssceneversion.VersionStateConverter;
import com.wakedt.visual.businessscene.infrastructure.BaseConvert;
import com.wakedt.visual.businessscene.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert extends BaseConvert<BusinessSceneVersionForkDTO, BusinessSceneVersionForkCmd> {

    BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionForkDTO2BusinessSceneVersionForkCmdConvert.class);
}