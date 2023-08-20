package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.client.domaindesign.dto.DomainDesignDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignDTO2DomainDesignDOConvert extends BaseConvert<DomainDesignDTO, DomainDesignDO> {

    DomainDesignDTO2DomainDesignDOConvert INSTANCE = Mappers.getMapper(DomainDesignDTO2DomainDesignDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "identity", target = "identity")
    @Mapping(source = "description", target = "description")
    @Override
    DomainDesignDO dto2Do(DomainDesignDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "identity", target = "identity")
    @Mapping(source = "description", target = "description")
    @Override
    DomainDesignDTO do2Dto(DomainDesignDO d);
}