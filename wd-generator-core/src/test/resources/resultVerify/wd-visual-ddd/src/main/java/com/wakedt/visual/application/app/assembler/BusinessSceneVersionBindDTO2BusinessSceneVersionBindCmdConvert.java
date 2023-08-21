package com.wakedt.visual.application.app.assembler;

import com.wakedt.visual.application.app.cmd.businesssceneversionbind.BusinessSceneVersionBindCmd;
import com.wakedt.visual.application.client.query.BusinessSceneVersionBindDTO;
import com.wakedt.visual.application.domain.applicationversion.VersionStateConverter;
import com.wakedt.visual.application.infrastructure.BaseConvert;
import com.wakedt.visual.application.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert extends BaseConvert<BusinessSceneVersionBindDTO, BusinessSceneVersionBindCmd> {

    BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert.class);
}