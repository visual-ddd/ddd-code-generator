package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.domaindesign.query.DomainDesignRemoveDTO;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove.DomainDesignRemoveCmd;

/**
 * DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert extends BaseConvert<DomainDesignRemoveDTO, DomainDesignRemoveCmd> {

    DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert INSTANCE = Mappers.getMapper(DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert.class);
}