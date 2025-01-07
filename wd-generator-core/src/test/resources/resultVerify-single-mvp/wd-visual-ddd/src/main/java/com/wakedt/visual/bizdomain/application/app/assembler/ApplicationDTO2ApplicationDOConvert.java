package com.wakedt.visual.bizdomain.application.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.bizdomain.application.client.response.ApplicationDTO;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.model.ApplicationDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationDTO2ApplicationDOConvert extends BaseConvert<ApplicationDTO, ApplicationDO> {

    ApplicationDTO2ApplicationDOConvert INSTANCE = Mappers.getMapper(ApplicationDTO2ApplicationDOConvert.class);

}