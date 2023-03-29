package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionModifyDTO;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionmodify.DomainDesignVersionModifyCmd;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.VersionStateConverter;

@Mapper(uses = {
        VersionStateConverter.class,
        JsonConverter.class,
})
public interface DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert extends BaseConvert<DomainDesignVersionModifyDTO, DomainDesignVersionModifyCmd> {

    DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert.class);
}