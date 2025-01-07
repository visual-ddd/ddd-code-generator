package com.wakedt.visual.bizdomain.domaindesign.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.bizdomain.domaindesign.client.response.DomainDesignVersionDTO;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignVersionDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignVersionDTO2DomainDesignVersionDOConvert extends BaseConvert<DomainDesignVersionDTO, DomainDesignVersionDO> {

    DomainDesignVersionDTO2DomainDesignVersionDOConvert INSTANCE = Mappers.getMapper(DomainDesignVersionDTO2DomainDesignVersionDOConvert.class);

}