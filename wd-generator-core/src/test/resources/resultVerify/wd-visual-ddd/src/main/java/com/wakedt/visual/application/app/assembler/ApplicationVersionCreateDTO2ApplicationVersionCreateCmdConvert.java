package com.wakedt.visual.application.app.assembler;

import com.wakedt.visual.application.app.cmd.applicationversioncreate.ApplicationVersionCreateCmd;
import com.wakedt.visual.application.client.query.ApplicationVersionCreateDTO;
import com.wakedt.visual.application.domain.applicationversion.VersionStateConverter;
import com.wakedt.visual.application.infrastructure.BaseConvert;
import com.wakedt.visual.application.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersionCreateDTO2ApplicationVersionCreateCmdConvert extends BaseConvert<ApplicationVersionCreateDTO, ApplicationVersionCreateCmd> {

    ApplicationVersionCreateDTO2ApplicationVersionCreateCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionCreateDTO2ApplicationVersionCreateCmdConvert.class);
}