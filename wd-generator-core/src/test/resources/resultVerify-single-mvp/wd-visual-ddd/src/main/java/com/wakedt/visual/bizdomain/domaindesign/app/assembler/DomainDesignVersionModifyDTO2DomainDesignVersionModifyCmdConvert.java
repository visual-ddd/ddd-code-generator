package com.wakedt.visual.bizdomain.domaindesign.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.domaindesign.client.request.DomainDesignVersionModifyDTO;
import com.wakedt.visual.bizdomain.domaindesign.app.cmd.domaindesignversionmodify.DomainDesignVersionModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert extends BaseConvert<DomainDesignVersionModifyDTO, DomainDesignVersionModifyCmd> {

    DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert INSTANCE = Mappers.getMapper(DomainDesignVersionModifyDTO2DomainDesignVersionModifyCmdConvert.class);
}