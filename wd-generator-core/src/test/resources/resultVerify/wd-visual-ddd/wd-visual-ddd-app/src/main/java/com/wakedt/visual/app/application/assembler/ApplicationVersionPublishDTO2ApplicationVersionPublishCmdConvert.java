package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.ApplicationVersionPublishDTO;
import com.wakedt.visual.domain.application.applicationversion.applicationversionpublish.ApplicationVersionPublishCmd;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;

@Mapper(uses = {
        VersionStateConverter.class,
        JsonConverter.class,
})
public interface ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert extends BaseConvert<ApplicationVersionPublishDTO, ApplicationVersionPublishCmd> {

    ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert.class);
}