package com.wakedt.visual.bizdomain.domaindesign.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignCreateDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesigncreate.DomainDesignCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignCreateDTO2DomainDesignCreateCmdConvert extends BaseConvert<DomainDesignCreateDTO, DomainDesignCreateCmd> {

    DomainDesignCreateDTO2DomainDesignCreateCmdConvert INSTANCE = Mappers.getMapper(DomainDesignCreateDTO2DomainDesignCreateCmdConvert.class);
}