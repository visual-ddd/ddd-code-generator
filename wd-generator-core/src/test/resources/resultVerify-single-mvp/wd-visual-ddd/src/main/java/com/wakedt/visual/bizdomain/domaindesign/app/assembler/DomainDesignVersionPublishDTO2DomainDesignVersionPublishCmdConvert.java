package com.wakedt.visual.bizdomain.domaindesign.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionPublishDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversionpublish.DomainDesignVersionPublishCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignVersionPublishDTO2DomainDesignVersionPublishCmdConvert extends BaseConvert<DomainDesignVersionPublishDTO, DomainDesignVersionPublishCmd> {

    DomainDesignVersionPublishDTO2DomainDesignVersionPublishCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionPublishDTO2DomainDesignVersionPublishCmdConvert.class);
}