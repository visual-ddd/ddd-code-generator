package com.wakedt.visual.domaindesign.app.assembler;

import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionpublish.DomainDesignVersionPublishCmd;
import com.wakedt.visual.domaindesign.client.query.DomainDesignVersionPublishDTO;
import com.wakedt.visual.domaindesign.domain.domaindesignversion.VersionStateConverter;
import com.wakedt.visual.domaindesign.infrastructure.BaseConvert;
import com.wakedt.visual.domaindesign.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionPublishDTO2DomainDesignVersionPublishCmdConvert extends BaseConvert<DomainDesignVersionPublishDTO, DomainDesignVersionPublishCmd> {

    DomainDesignVersionPublishDTO2DomainDesignVersionPublishCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionPublishDTO2DomainDesignVersionPublishCmdConvert.class);
}