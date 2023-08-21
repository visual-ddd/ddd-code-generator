package com.wakedt.visual.infrastructure.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.domaindesign.domaindesign.DomainDesign;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesign2DomainDesignDOConvert extends BaseConvert<DomainDesign, DomainDesignDO> {

    DomainDesign2DomainDesignDOConvert INSTANCE = Mappers.getMapper(DomainDesign2DomainDesignDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "identity", target = "identity")
    @Mapping(source = "description", target = "description")
    @Override
    DomainDesignDO dto2Do(DomainDesign dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "teamId", target = "teamId")
    @Mapping(source = "identity", target = "identity")
    @Mapping(source = "description", target = "description")
    @Override
    DomainDesign do2Dto(DomainDesignDO d);
}
