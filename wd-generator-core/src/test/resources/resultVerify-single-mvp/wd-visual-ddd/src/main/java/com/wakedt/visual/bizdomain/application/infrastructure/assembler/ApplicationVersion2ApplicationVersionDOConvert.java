package com.wakedt.visual.bizdomain.application.infrastructure.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.application.domain.applicationversion.ApplicationVersion;
import com.wakedt.visual.bizdomain.application.infrastructure.repository.model.ApplicationVersionDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationVersion2ApplicationVersionDOConvert extends BaseConvert<ApplicationVersion, ApplicationVersionDO> {

    ApplicationVersion2ApplicationVersionDOConvert INSTANCE = Mappers.getMapper(ApplicationVersion2ApplicationVersionDOConvert.class);

}
