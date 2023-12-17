package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.client.domaindesign.dto.DomainDesignVersionDTO;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignVersionDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * DomainDesignVersionDTO2DomainDesignVersionDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignVersionDTO2DomainDesignVersionDOConvert extends BaseConvert<DomainDesignVersionDTO, DomainDesignVersionDO> {

    DomainDesignVersionDTO2DomainDesignVersionDOConvert INSTANCE = Mappers.getMapper(DomainDesignVersionDTO2DomainDesignVersionDOConvert.class);

}