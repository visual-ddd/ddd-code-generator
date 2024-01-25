package com.wakedt.visual.infrastructure.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.DomainDesignVersion;
import com.wakedt.visual.infrastructure.domaindesign.repository.model.DomainDesignVersionDO;

/**
 * DomainDesignVersion2DomainDesignVersionDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersion2DomainDesignVersionDOConvert extends BaseConvert<DomainDesignVersion, DomainDesignVersionDO> {

    DomainDesignVersion2DomainDesignVersionDOConvert INSTANCE = Mappers.getMapper(DomainDesignVersion2DomainDesignVersionDOConvert.class);

}
