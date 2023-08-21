package com.wakedt.visual.domaindesign.app.assembler;

import com.wakedt.visual.domaindesign.infrastructure.BaseConvert;
import com.wakedt.visual.domaindesign.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domaindesign.client.query.DomainDesignCreateDTO;
import com.wakedt.visual.domaindesign.app.cmd.domaindesigncreate.DomainDesignCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignCreateDTO2DomainDesignCreateCmdConvert extends BaseConvert<DomainDesignCreateDTO, DomainDesignCreateCmd> {

    DomainDesignCreateDTO2DomainDesignCreateCmdConvert INSTANCE = Mappers.getMapper(DomainDesignCreateDTO2DomainDesignCreateCmdConvert.class);
}