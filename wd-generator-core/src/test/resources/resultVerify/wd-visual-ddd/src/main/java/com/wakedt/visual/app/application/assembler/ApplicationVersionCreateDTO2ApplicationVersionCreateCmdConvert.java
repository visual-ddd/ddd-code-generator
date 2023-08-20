package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.client.application.query.ApplicationVersionCreateDTO;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;
import com.wakedt.visual.domain.application.applicationversion.applicationversioncreate.ApplicationVersionCreateCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersionCreateDTO2ApplicationVersionCreateCmdConvert extends BaseConvert<ApplicationVersionCreateDTO, ApplicationVersionCreateCmd> {

    ApplicationVersionCreateDTO2ApplicationVersionCreateCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionCreateDTO2ApplicationVersionCreateCmdConvert.class);
}