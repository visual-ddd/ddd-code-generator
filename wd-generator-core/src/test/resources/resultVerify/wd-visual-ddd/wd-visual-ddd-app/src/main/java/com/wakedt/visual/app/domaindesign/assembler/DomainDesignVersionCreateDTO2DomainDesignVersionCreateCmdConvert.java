package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionCreateDTO;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversioncreate.DomainDesignVersionCreateCmd;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.VersionStateConverter;

/**
 * DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert extends BaseConvert<DomainDesignVersionCreateDTO, DomainDesignVersionCreateCmd> {

    DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert.class);
}