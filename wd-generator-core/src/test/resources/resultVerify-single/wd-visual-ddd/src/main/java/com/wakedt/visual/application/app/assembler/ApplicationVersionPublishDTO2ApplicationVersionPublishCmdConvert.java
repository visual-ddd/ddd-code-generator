package com.wakedt.visual.application.app.assembler;

import com.wakedt.visual.application.infrastructure.BaseConvert;
import com.wakedt.visual.application.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.application.client.query.ApplicationVersionPublishDTO;
import com.wakedt.visual.application.app.cmd.applicationversionpublish.ApplicationVersionPublishCmd;
import com.wakedt.visual.application.domain.applicationversion.VersionStateConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert extends BaseConvert<ApplicationVersionPublishDTO, ApplicationVersionPublishCmd> {

    ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert.class);
}