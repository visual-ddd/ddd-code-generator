package com.wakedt.visual.infrastructure.application.assembler;

import com.wakedt.visual.domain.application.applicationversion.ApplicationVersion;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationVersionDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * ApplicationVersion2ApplicationVersionDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersion2ApplicationVersionDOConvert extends BaseConvert<ApplicationVersion, ApplicationVersionDO> {

    ApplicationVersion2ApplicationVersionDOConvert INSTANCE = Mappers.getMapper(ApplicationVersion2ApplicationVersionDOConvert.class);

}
