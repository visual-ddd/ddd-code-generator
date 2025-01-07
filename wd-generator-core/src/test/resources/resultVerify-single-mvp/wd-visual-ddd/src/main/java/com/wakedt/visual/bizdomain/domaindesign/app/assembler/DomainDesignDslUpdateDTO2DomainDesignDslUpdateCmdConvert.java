package com.wakedt.visual.bizdomain.domaindesign.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignDslUpdateDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesigndslupdate.DomainDesignDslUpdateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert extends BaseConvert<DomainDesignDslUpdateDTO, DomainDesignDslUpdateCmd> {

    DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert INSTANCE = Mappers.getMapper(DomainDesignDslUpdateDTO2DomainDesignDslUpdateCmdConvert.class);
}