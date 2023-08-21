package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignVersionDTO;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignVersionDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignVersionDTO2DomainDesignVersionDOConvert extends BaseConvert<DomainDesignVersionDTO, DomainDesignVersionDO> {

    DomainDesignVersionDTO2DomainDesignVersionDOConvert INSTANCE = Mappers.getMapper(DomainDesignVersionDTO2DomainDesignVersionDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "domainDesignId", target = "domainDesignId")
    @Mapping(source = "startVersion", target = "startVersion")
    @Mapping(source = "currentVersion", target = "currentVersion")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "domainDesignDsl", target = "domainDesignDsl")
    @Mapping(source = "graphDsl", target = "graphDsl")
    @Mapping(source = "versionState", target = "versionState")
    @Override
    DomainDesignVersionDO dto2Do(DomainDesignVersionDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "domainDesignId", target = "domainDesignId")
    @Mapping(source = "startVersion", target = "startVersion")
    @Mapping(source = "currentVersion", target = "currentVersion")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "domainDesignDsl", target = "domainDesignDsl")
    @Mapping(source = "graphDsl", target = "graphDsl")
    @Mapping(source = "versionState", target = "versionState")
    @Override
    DomainDesignVersionDTO do2Dto(DomainDesignVersionDO d);
}