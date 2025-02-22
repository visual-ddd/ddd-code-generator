package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.client.application.dto.ApplicationDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * ApplicationDTO2ApplicationDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationDTO2ApplicationDOConvert extends BaseConvert<ApplicationDTO, ApplicationDO> {

    ApplicationDTO2ApplicationDOConvert INSTANCE = Mappers.getMapper(ApplicationDTO2ApplicationDOConvert.class);

}