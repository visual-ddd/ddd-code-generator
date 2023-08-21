package com.wakedt.visual.domaindesign.infrastructure.assembler;

import com.wakedt.visual.domaindesign.domain.domaindesign.DomainDesign;
import com.wakedt.visual.domaindesign.infrastructure.BaseConvert;
import com.wakedt.visual.domaindesign.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.domaindesign.infrastructure.repository.model.DomainDesignDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

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
