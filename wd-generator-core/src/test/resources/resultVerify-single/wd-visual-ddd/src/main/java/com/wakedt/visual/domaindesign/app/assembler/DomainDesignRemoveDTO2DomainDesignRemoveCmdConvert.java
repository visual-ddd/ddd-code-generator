package com.wakedt.visual.domaindesign.app.assembler;

import com.wakedt.visual.domaindesign.infrastructure.BaseConvert;
import com.wakedt.visual.domaindesign.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domaindesign.client.query.DomainDesignRemoveDTO;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignremove.DomainDesignRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert extends BaseConvert<DomainDesignRemoveDTO, DomainDesignRemoveCmd> {

    DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert INSTANCE = Mappers.getMapper(DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert.class);
}