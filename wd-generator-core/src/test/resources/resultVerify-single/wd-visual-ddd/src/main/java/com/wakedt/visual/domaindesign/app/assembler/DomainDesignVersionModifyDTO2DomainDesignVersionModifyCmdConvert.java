package com.wakedt.visual.domaindesign.app.assembler;

import com.wakedt.visual.domaindesign.infrastructure.BaseConvert;
import com.wakedt.visual.domaindesign.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domaindesign.client.query.DomainDesignVersionModifyDTO;
import com.wakedt.visual.domaindesign.app.cmd.domaindesignversionmodify.DomainDesignVersionModifyCmd;
import com.wakedt.visual.domaindesign.domain.domaindesignversion.VersionStateConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert extends BaseConvert<DomainDesignVersionModifyDTO, DomainDesignVersionModifyCmd> {

    DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert.class);
}