package com.wakedt.visual.application.infrastructure.assembler;

import com.wakedt.visual.application.domain.applicationversion.ApplicationVersion;
import com.wakedt.visual.application.domain.applicationversion.VersionStateConverter;
import com.wakedt.visual.application.infrastructure.BaseConvert;
import com.wakedt.visual.application.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.application.infrastructure.repository.model.ApplicationVersionDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersion2ApplicationVersionDOConvert extends BaseConvert<ApplicationVersion, ApplicationVersionDO> {

    ApplicationVersion2ApplicationVersionDOConvert INSTANCE = Mappers.getMapper(ApplicationVersion2ApplicationVersionDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "applicationId", target = "applicationId")
    @Mapping(source = "startVersion", target = "startVersion")
    @Mapping(source = "currentVersion", target = "currentVersion")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "versionState", target = "versionState")
    @Override
    ApplicationVersionDO dto2Do(ApplicationVersion dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "applicationId", target = "applicationId")
    @Mapping(source = "startVersion", target = "startVersion")
    @Mapping(source = "currentVersion", target = "currentVersion")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "versionState", target = "versionState")
    @Override
    ApplicationVersion do2Dto(ApplicationVersionDO d);
}
