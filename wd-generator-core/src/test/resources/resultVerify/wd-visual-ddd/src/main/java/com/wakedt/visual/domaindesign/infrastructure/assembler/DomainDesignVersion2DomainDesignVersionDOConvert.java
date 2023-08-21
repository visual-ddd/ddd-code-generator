package com.wakedt.visual.domaindesign.infrastructure.assembler;

import com.wakedt.visual.domaindesign.domain.domaindesignversion.DomainDesignVersion;
import com.wakedt.visual.domaindesign.domain.domaindesignversion.VersionStateConverter;
import com.wakedt.visual.domaindesign.infrastructure.BaseConvert;
import com.wakedt.visual.domaindesign.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.domaindesign.infrastructure.repository.model.DomainDesignVersionDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
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
