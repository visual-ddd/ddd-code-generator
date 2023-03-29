package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.ApplicationCreateDTO;
import com.wakedt.visual.domain.application.application.applicationcreate.ApplicationCreateCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface ApplicationCreateDTO2ApplicationCreateCmdConvert extends BaseConvert<ApplicationCreateDTO, ApplicationCreateCmd> {

    ApplicationCreateDTO2ApplicationCreateCmdConvert INSTANCE = Mappers.getMapper(ApplicationCreateDTO2ApplicationCreateCmdConvert.class);
}