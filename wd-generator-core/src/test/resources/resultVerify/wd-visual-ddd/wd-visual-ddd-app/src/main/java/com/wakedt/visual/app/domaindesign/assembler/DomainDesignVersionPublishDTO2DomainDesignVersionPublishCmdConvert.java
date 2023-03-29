package com.wakedt.visual.app.domaindesign.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.domaindesign.query.DomainDesignVersionPublishDTO;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.domaindesignversionpublish.DomainDesignVersionPublishCmd;
import com.wakedt.visual.domain.domaindesign.domaindesignversion.VersionStateConverter;

@Mapper(uses = {
        VersionStateConverter.class,
        JsonConverter.class,
})
public interface DomainDesignVersionPublishDTO2DomainDesignVersionPublishCmdConvert extends BaseConvert<DomainDesignVersionPublishDTO, DomainDesignVersionPublishCmd> {

    DomainDesignVersionPublishDTO2DomainDesignVersionPublishCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionPublishDTO2DomainDesignVersionPublishCmdConvert.class);
}