package com.wakedt.visual.application.app.assembler;

import com.wakedt.visual.application.infrastructure.BaseConvert;
import com.wakedt.visual.application.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.application.client.query.ApplicationCreateDTO;
import com.wakedt.visual.application.app.cmd.applicationcreate.ApplicationCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationCreateDTO2ApplicationCreateCmdConvert extends BaseConvert<ApplicationCreateDTO, ApplicationCreateCmd> {

    ApplicationCreateDTO2ApplicationCreateCmdConvert INSTANCE = Mappers.getMapper(ApplicationCreateDTO2ApplicationCreateCmdConvert.class);
}