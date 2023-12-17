package com.wakedt.visual.infrastructure.application.assembler;

import com.wakedt.visual.domain.application.application.Application;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Application2ApplicationDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Application2ApplicationDOConvert extends BaseConvert<Application, ApplicationDO> {

    Application2ApplicationDOConvert INSTANCE = Mappers.getMapper(Application2ApplicationDOConvert.class);

}
