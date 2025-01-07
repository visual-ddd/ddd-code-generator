package com.wakedt.visual.bizdomain.domaindesign.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionForkDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversionfork.DomainDesignVersionForkCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert extends BaseConvert<DomainDesignVersionForkDTO, DomainDesignVersionForkCmd> {

    DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionForkDTO2DomainDesignVersionForkCmdConvert.class);
}