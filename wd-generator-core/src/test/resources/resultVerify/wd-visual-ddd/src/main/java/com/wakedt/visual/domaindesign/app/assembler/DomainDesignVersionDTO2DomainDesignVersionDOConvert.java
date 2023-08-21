package com.wakedt.visual.domaindesign.app.assembler;

import com.wakedt.visual.domaindesign.client.dto.DomainDesignVersionDTO;
import com.wakedt.visual.domaindesign.infrastructure.BaseConvert;
import com.wakedt.visual.domaindesign.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.domaindesign.infrastructure.repository.model.DomainDesignVersionDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

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