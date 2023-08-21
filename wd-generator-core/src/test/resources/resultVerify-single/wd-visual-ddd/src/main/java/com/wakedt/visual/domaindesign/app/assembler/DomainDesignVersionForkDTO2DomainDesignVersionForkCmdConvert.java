package com.wakedt.visual.domaindesign.app.assembler;

import com.wakedt.visual.domaindesign.infrastructure.BaseConvert;
import com.wakedt.visual.domaindesign.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domaindesign.client.query.DomainDesignVersionForkDTO;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionfork.DomainDesignVersionForkCmd;
import com.wakedt.visual.domaindesign.domain.domaindesignversion.VersionStateConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert extends BaseConvert<DomainDesignVersionForkDTO, DomainDesignVersionForkCmd> {

    DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert.class);
}