package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.DomainDesignVersionBindDTO;
import com.wakedt.visual.domain.application.applicationversion.domaindesignversionbind.DomainDesignVersionBindCmd;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;

/**
 * DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert extends BaseConvert<DomainDesignVersionBindDTO, DomainDesignVersionBindCmd> {

    DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert.class);
}