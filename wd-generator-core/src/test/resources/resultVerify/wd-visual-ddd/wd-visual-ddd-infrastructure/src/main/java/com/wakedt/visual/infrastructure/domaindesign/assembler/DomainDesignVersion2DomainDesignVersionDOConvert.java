package com.wakedt.visual.infrastructure.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.DomainDesignVersion;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignVersionDO;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.VersionStateConverter;

@Mapper(uses = {
        VersionStateConverter.class,
})
public interface DomainDesignVersion2DomainDesignVersionDOConvert extends BaseConvert<DomainDesignVersion, DomainDesignVersionDO> {

    DomainDesignVersion2DomainDesignVersionDOConvert INSTANCE = Mappers.getMapper(DomainDesignVersion2DomainDesignVersionDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "domainDesignId", target = "domainDesignId")
    @Mapping(source = "startVersion", target = "startVersion")
    @Mapping(source = "currentVersion", target = "currentVersion")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "domainDesignDsl", target = "domainDesignDsl")
    @Mapping(source = "graphDsl", target = "graphDsl")
    @Mapping(source = "versionState", target = "versionState")
    @Override
    DomainDesignVersionDO dto2Do(DomainDesignVersion dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "domainDesignId", target = "domainDesignId")
    @Mapping(source = "startVersion", target = "startVersion")
    @Mapping(source = "currentVersion", target = "currentVersion")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "domainDesignDsl", target = "domainDesignDsl")
    @Mapping(source = "graphDsl", target = "graphDsl")
    @Mapping(source = "versionState", target = "versionState")
    @Override
    DomainDesignVersion do2Dto(DomainDesignVersionDO d);
}
