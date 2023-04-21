package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.DomainDesignVersionBindDTO;
import com.wakedt.visual.domain.application.applicationversion.domaindesignversionbind.DomainDesignVersionBindCmd;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert extends BaseConvert<DomainDesignVersionBindDTO, DomainDesignVersionBindCmd> {

    DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert.class);
}