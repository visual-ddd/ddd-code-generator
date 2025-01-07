package com.wakedt.visual.bizdomain.domaindesign.infrastructure.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesign.DomainDesign;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesign2DomainDesignDOConvert extends BaseConvert<DomainDesign, DomainDesignDO> {

    DomainDesign2DomainDesignDOConvert INSTANCE = Mappers.getMapper(DomainDesign2DomainDesignDOConvert.class);

}
