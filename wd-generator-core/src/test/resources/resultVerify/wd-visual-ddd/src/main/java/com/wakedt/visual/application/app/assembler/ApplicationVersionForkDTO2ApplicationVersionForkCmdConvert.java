package com.wakedt.visual.application.app.assembler;

import com.wakedt.visual.application.app.cmd.applicationversionfork.ApplicationVersionForkCmd;
import com.wakedt.visual.application.client.query.ApplicationVersionForkDTO;
import com.wakedt.visual.application.domain.applicationversion.VersionStateConverter;
import com.wakedt.visual.application.infrastructure.BaseConvert;
import com.wakedt.visual.application.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersionForkDTO2ApplicationVersionForkCmdConvert extends BaseConvert<ApplicationVersionForkDTO, ApplicationVersionForkCmd> {

    ApplicationVersionForkDTO2ApplicationVersionForkCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionForkDTO2ApplicationVersionForkCmdConvert.class);
}