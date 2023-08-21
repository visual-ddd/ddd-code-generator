package com.wakedt.visual.application.app.assembler;

import com.wakedt.visual.application.app.cmd.applicationversionremove.ApplicationVersionRemoveCmd;
import com.wakedt.visual.application.client.query.ApplicationVersionRemoveDTO;
import com.wakedt.visual.application.domain.applicationversion.VersionStateConverter;
import com.wakedt.visual.application.infrastructure.BaseConvert;
import com.wakedt.visual.application.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert extends BaseConvert<ApplicationVersionRemoveDTO, ApplicationVersionRemoveCmd> {

    ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert.class);
}