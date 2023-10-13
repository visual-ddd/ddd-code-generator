package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.domaindesign.dto.DomainDesignVersionDTO;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignVersionDO;

/**
 * DomainDesignVersionDTO2DomainDesignVersionDOConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignVersionDTO2DomainDesignVersionDOConvert extends BaseConvert<DomainDesignVersionDTO, DomainDesignVersionDO> {

    DomainDesignVersionDTO2DomainDesignVersionDOConvert INSTANCE = Mappers.getMapper(DomainDesignVersionDTO2DomainDesignVersionDOConvert.class);

}