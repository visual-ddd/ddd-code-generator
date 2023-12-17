package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.client.domaindesign.query.DomainDesignModifyDTO;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignmodify.DomainDesignModifyCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * DomainDesignModifyDTO2DomainDesignModifyCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignModifyDTO2DomainDesignModifyCmdConvert extends BaseConvert<DomainDesignModifyDTO, DomainDesignModifyCmd> {

    DomainDesignModifyDTO2DomainDesignModifyCmdConvert INSTANCE = Mappers.getMapper(DomainDesignModifyDTO2DomainDesignModifyCmdConvert.class);
}