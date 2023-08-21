package com.wakedt.visual.domaindesign.app.assembler;

import com.wakedt.visual.domaindesign.app.cmd.domaindesigndslupdate.DomainDesignDslUpdateCmd;
import com.wakedt.visual.domaindesign.client.query.DomainDesignDslUpdateDTO;
import com.wakedt.visual.domaindesign.domain.domaindesignversion.VersionStateConverter;
import com.wakedt.visual.domaindesign.infrastructure.BaseConvert;
import com.wakedt.visual.domaindesign.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert extends BaseConvert<DomainDesignDslUpdateDTO, DomainDesignDslUpdateCmd> {

    DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert INSTANCE = Mappers.getMapper(DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert.class);
}