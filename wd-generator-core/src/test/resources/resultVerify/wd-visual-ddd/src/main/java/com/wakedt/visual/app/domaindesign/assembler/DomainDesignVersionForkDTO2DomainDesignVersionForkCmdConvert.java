package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionForkDTO;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.VersionStateConverter;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionfork.DomainDesignVersionForkCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert extends BaseConvert<DomainDesignVersionForkDTO, DomainDesignVersionForkCmd> {

    DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert.class);
}