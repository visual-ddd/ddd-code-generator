package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionForkDTO;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionfork.DomainDesignVersionForkCmd;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.VersionStateConverter;

/**
 * DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert extends BaseConvert<DomainDesignVersionForkDTO, DomainDesignVersionForkCmd> {

    DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert.class);
}