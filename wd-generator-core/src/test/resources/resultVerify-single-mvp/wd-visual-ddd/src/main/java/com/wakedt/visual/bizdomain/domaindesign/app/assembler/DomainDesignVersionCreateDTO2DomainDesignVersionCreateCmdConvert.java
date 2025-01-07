package com.wakedt.visual.bizdomain.domaindesign.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionCreateDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversioncreate.DomainDesignVersionCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert extends BaseConvert<DomainDesignVersionCreateDTO, DomainDesignVersionCreateCmd> {

    DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert.class);
}