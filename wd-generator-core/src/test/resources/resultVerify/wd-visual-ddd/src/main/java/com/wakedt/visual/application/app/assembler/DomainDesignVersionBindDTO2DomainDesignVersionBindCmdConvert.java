package com.wakedt.visual.application.app.assembler;

import com.wakedt.visual.application.app.cmd.domaindesignversionbind.DomainDesignVersionBindCmd;
import com.wakedt.visual.application.client.query.DomainDesignVersionBindDTO;
import com.wakedt.visual.application.domain.applicationversion.VersionStateConverter;
import com.wakedt.visual.application.infrastructure.BaseConvert;
import com.wakedt.visual.application.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert extends BaseConvert<DomainDesignVersionBindDTO, DomainDesignVersionBindCmd> {

    DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert.class);
}