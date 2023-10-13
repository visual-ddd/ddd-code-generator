package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionModifyDTO;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify.DomainDesignVersionModifyCmd;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.VersionStateConverter;

/**
 * DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert extends BaseConvert<DomainDesignVersionModifyDTO, DomainDesignVersionModifyCmd> {

    DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert.class);
}