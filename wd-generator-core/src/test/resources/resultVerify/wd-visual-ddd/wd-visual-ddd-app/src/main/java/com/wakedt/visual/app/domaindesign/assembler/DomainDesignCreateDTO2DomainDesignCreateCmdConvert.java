package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.domaindesign.query.DomainDesignCreateDTO;
import com.wakedt.visual.domain.domaindesign.domaindesign.domaindesigncreate.DomainDesignCreateCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface DomainDesignCreateDTO2DomainDesignCreateCmdConvert extends BaseConvert<DomainDesignCreateDTO, DomainDesignCreateCmd> {

    DomainDesignCreateDTO2DomainDesignCreateCmdConvert INSTANCE = Mappers.getMapper(DomainDesignCreateDTO2DomainDesignCreateCmdConvert.class);
}