package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.client.domaindesign.dto.DomainDesignDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * DomainDesignDTO2DomainDesignDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        DomainDesignDTOConverter.class,
        DomainDesignVersionDTOConverter.class,
})
public interface DomainDesignDTO2DomainDesignDOConvert extends BaseConvert<DomainDesignDTO, DomainDesignDO> {

    DomainDesignDTO2DomainDesignDOConvert INSTANCE = Mappers.getMapper(DomainDesignDTO2DomainDesignDOConvert.class);

}