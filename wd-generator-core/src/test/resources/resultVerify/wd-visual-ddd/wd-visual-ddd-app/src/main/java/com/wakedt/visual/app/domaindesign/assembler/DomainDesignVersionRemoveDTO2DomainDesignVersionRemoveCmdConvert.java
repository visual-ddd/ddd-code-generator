package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionRemoveDTO;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionremove.DomainDesignVersionRemoveCmd;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.VersionStateConverter;

/**
 * DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert extends BaseConvert<DomainDesignVersionRemoveDTO, DomainDesignVersionRemoveCmd> {

    DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert.class);
}