package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.client.application.dto.ApplicationVersionDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.application.repository.model.ApplicationVersionDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationVersionDTO2ApplicationVersionDOConvert extends BaseConvert<ApplicationVersionDTO, ApplicationVersionDO> {

    ApplicationVersionDTO2ApplicationVersionDOConvert INSTANCE = Mappers.getMapper(ApplicationVersionDTO2ApplicationVersionDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "applicationId", target = "applicationId")
    @Mapping(source = "startVersion", target = "startVersion")
    @Mapping(source = "currentVersion", target = "currentVersion")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "versionState", target = "versionState")
    @Override
    ApplicationVersionDO dto2Do(ApplicationVersionDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "applicationId", target = "applicationId")
    @Mapping(source = "startVersion", target = "startVersion")
    @Mapping(source = "currentVersion", target = "currentVersion")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "versionState", target = "versionState")
    @Override
    ApplicationVersionDTO do2Dto(ApplicationVersionDO d);
}