package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.application.dto.ApplicationDTO;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationDO;

/**
 * ApplicationDTO2ApplicationDOConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationDTO2ApplicationDOConvert extends BaseConvert<ApplicationDTO, ApplicationDO> {

    ApplicationDTO2ApplicationDOConvert INSTANCE = Mappers.getMapper(ApplicationDTO2ApplicationDOConvert.class);

}