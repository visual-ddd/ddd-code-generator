package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.domaindesign.query.DomainDesignDslUpdateDTO;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesigndslupdate.DomainDesignDslUpdateCmd;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.VersionStateConverter;

/**
 * DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert extends BaseConvert<DomainDesignDslUpdateDTO, DomainDesignDslUpdateCmd> {

    DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert INSTANCE = Mappers.getMapper(DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert.class);
}