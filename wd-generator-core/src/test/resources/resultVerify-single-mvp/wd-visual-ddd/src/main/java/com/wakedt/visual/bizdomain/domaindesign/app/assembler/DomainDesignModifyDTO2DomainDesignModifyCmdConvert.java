package com.wakedt.visual.bizdomain.domaindesign.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignModifyDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignmodify.DomainDesignModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignModifyDTO2DomainDesignModifyCmdConvert extends BaseConvert<DomainDesignModifyDTO, DomainDesignModifyCmd> {

    DomainDesignModifyDTO2DomainDesignModifyCmdConvert INSTANCE = Mappers.getMapper(DomainDesignModifyDTO2DomainDesignModifyCmdConvert.class);
}