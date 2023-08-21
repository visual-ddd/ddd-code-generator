package com.wakedt.visual.domaindesign.app.assembler;

import com.wakedt.visual.domaindesign.app.cmd.domaindesignversioncreate.DomainDesignVersionCreateCmd;
import com.wakedt.visual.domaindesign.client.query.DomainDesignVersionCreateDTO;
import com.wakedt.visual.domaindesign.domain.domaindesignversion.VersionStateConverter;
import com.wakedt.visual.domaindesign.infrastructure.BaseConvert;
import com.wakedt.visual.domaindesign.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert extends BaseConvert<DomainDesignVersionCreateDTO, DomainDesignVersionCreateCmd> {

    DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionCreateDTO2DomainDesignVersionCreateCmdConvert.class);
}