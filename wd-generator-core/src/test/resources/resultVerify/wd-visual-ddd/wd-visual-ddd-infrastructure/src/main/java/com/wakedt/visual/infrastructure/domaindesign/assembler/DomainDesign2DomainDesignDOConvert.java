package com.wakedt.visual.infrastructure.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.domaindesign.domaindesign.DomainDesign;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignDO;

/**
 * DomainDesign2DomainDesignDOConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesign2DomainDesignDOConvert extends BaseConvert<DomainDesign, DomainDesignDO> {

    DomainDesign2DomainDesignDOConvert INSTANCE = Mappers.getMapper(DomainDesign2DomainDesignDOConvert.class);

}
