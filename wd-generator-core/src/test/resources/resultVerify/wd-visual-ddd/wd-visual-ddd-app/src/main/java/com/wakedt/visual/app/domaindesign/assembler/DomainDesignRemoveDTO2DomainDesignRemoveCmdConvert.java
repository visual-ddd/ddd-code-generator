package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.domaindesign.query.DomainDesignRemoveDTO;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesignremove.DomainDesignRemoveCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert extends BaseConvert<DomainDesignRemoveDTO, DomainDesignRemoveCmd> {

    DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert INSTANCE = Mappers.getMapper(DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert.class);
}