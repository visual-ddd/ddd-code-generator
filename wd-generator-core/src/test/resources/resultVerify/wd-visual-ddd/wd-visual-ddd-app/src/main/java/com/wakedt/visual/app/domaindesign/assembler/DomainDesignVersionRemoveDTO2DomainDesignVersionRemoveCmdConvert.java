package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionRemoveDTO;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionremove.DomainDesignVersionRemoveCmd;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.VersionStateConverter;

@Mapper(uses = {
        VersionStateConverter.class,
        JsonConverter.class,
})
public interface DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert extends BaseConvert<DomainDesignVersionRemoveDTO, DomainDesignVersionRemoveCmd> {

    DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert.class);
}