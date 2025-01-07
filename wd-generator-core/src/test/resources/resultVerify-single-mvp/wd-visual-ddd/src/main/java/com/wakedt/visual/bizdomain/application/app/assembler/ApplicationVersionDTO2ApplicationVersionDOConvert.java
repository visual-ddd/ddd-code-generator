package com.wakedt.visual.bizdomain.application.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.bizdomain.application.client.response.ApplicationVersionDTO;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.model.ApplicationVersionDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationVersionDTO2ApplicationVersionDOConvert extends BaseConvert<ApplicationVersionDTO, ApplicationVersionDO> {

    ApplicationVersionDTO2ApplicationVersionDOConvert INSTANCE = Mappers.getMapper(ApplicationVersionDTO2ApplicationVersionDOConvert.class);

}