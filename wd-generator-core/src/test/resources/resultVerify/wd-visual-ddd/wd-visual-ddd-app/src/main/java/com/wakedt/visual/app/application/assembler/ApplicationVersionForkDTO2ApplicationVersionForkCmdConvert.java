package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.ApplicationVersionForkDTO;
import com.wakedt.visual.domain.application.applicationversion.applicationversionfork.ApplicationVersionForkCmd;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;

/**
 * ApplicationVersionForkDTO2ApplicationVersionForkCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersionForkDTO2ApplicationVersionForkCmdConvert extends BaseConvert<ApplicationVersionForkDTO, ApplicationVersionForkCmd> {

    ApplicationVersionForkDTO2ApplicationVersionForkCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionForkDTO2ApplicationVersionForkCmdConvert.class);
}