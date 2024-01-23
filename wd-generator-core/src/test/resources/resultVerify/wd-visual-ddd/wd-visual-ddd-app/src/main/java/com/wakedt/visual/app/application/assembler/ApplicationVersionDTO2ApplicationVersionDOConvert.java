package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.client.application.dto.ApplicationVersionDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationVersionDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * ApplicationVersionDTO2ApplicationVersionDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        ApplicationDTOConverter.class,
        ApplicationVersionDTOConverter.class,
})
public interface ApplicationVersionDTO2ApplicationVersionDOConvert extends BaseConvert<ApplicationVersionDTO, ApplicationVersionDO> {

    ApplicationVersionDTO2ApplicationVersionDOConvert INSTANCE = Mappers.getMapper(ApplicationVersionDTO2ApplicationVersionDOConvert.class);

}