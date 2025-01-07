package com.wakedt.visual.bizdomain.application.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.application.client.request.DomainDesignVersionBindDTO;
import com.wakedt.visual.bizdomain.application.app.cmd.domaindesignversionbind.DomainDesignVersionBindCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert extends BaseConvert<DomainDesignVersionBindDTO, DomainDesignVersionBindCmd> {

    DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionBindDTO2DomainDesignVersionBindCmdConvert.class);
}