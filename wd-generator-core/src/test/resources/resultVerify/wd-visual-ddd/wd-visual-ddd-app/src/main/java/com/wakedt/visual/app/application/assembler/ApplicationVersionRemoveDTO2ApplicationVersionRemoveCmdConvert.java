package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.ApplicationVersionRemoveDTO;
import com.wakedt.visual.domain.application.applicationversion.applicationversionremove.ApplicationVersionRemoveCmd;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;

@Mapper(uses = {
        VersionStateConverter.class,
        JsonConverter.class,
})
public interface ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert extends BaseConvert<ApplicationVersionRemoveDTO, ApplicationVersionRemoveCmd> {

    ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert.class);
}