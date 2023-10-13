package com.wakedt.visual.infrastructure.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.application.applicationversion.ApplicationVersion;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationVersionDO;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;

/**
 * ApplicationVersion2ApplicationVersionDOConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersion2ApplicationVersionDOConvert extends BaseConvert<ApplicationVersion, ApplicationVersionDO> {

    ApplicationVersion2ApplicationVersionDOConvert INSTANCE = Mappers.getMapper(ApplicationVersion2ApplicationVersionDOConvert.class);

}
