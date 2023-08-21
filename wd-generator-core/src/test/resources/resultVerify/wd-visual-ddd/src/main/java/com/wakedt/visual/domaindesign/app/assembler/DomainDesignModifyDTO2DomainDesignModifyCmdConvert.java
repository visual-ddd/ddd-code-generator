package com.wakedt.visual.domaindesign.app.assembler;

import com.wakedt.visual.domaindesign.app.cmd.domaindesignmodify.DomainDesignModifyCmd;
import com.wakedt.visual.domaindesign.client.query.DomainDesignModifyDTO;
import com.wakedt.visual.domaindesign.infrastructure.BaseConvert;
import com.wakedt.visual.domaindesign.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignModifyDTO2DomainDesignModifyCmdConvert extends BaseConvert<DomainDesignModifyDTO, DomainDesignModifyCmd> {

    DomainDesignModifyDTO2DomainDesignModifyCmdConvert INSTANCE = Mappers.getMapper(DomainDesignModifyDTO2DomainDesignModifyCmdConvert.class);
}