package com.wakedt.visual.bizdomain.domaindesign.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignRemoveDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignremove.DomainDesignRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert extends BaseConvert<DomainDesignRemoveDTO, DomainDesignRemoveCmd> {

    DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert INSTANCE = Mappers.getMapper(DomainDesignRemoveDTO2DomainDesignRemoveCmdConvert.class);
}