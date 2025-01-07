package com.wakedt.visual.bizdomain.application.infrastructure.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.application.domain.application.Application;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.model.ApplicationDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface Application2ApplicationDOConvert extends BaseConvert<Application, ApplicationDO> {

    Application2ApplicationDOConvert INSTANCE = Mappers.getMapper(Application2ApplicationDOConvert.class);

}
