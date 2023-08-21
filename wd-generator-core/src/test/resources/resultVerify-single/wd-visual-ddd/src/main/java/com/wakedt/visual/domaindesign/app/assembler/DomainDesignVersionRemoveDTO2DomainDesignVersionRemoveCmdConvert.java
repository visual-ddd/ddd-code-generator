package com.wakedt.visual.domaindesign.app.assembler;

import com.wakedt.visual.domaindesign.infrastructure.BaseConvert;
import com.wakedt.visual.domaindesign.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domaindesign.client.query.DomainDesignVersionRemoveDTO;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionremove.DomainDesignVersionRemoveCmd;
import com.wakedt.visual.domaindesign.domain.domaindesignversion.VersionStateConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert extends BaseConvert<DomainDesignVersionRemoveDTO, DomainDesignVersionRemoveCmd> {

    DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert.class);
}