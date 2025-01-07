package com.wakedt.visual.bizdomain.domaindesign.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionRemoveDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversionremove.DomainDesignVersionRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert extends BaseConvert<DomainDesignVersionRemoveDTO, DomainDesignVersionRemoveCmd> {

    DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionRemoveDTO2DomainDesignVersionRemoveCmdConvert.class);
}