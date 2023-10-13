package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.ApplicationVersionPublishDTO;
import com.wakedt.visual.domain.application.applicationversion.applicationversionpublish.ApplicationVersionPublishCmd;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;

/**
 * ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert extends BaseConvert<ApplicationVersionPublishDTO, ApplicationVersionPublishCmd> {

    ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert.class);
}