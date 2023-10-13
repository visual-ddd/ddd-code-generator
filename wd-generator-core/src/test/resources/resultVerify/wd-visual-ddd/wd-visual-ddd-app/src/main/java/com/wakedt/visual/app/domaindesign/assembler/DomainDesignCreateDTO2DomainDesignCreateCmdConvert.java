package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.domaindesign.query.DomainDesignCreateDTO;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesigncreate.DomainDesignCreateCmd;

/**
 * DomainDesignCreateDTO2DomainDesignCreateCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignCreateDTO2DomainDesignCreateCmdConvert extends BaseConvert<DomainDesignCreateDTO, DomainDesignCreateCmd> {

    DomainDesignCreateDTO2DomainDesignCreateCmdConvert INSTANCE = Mappers.getMapper(DomainDesignCreateDTO2DomainDesignCreateCmdConvert.class);
}