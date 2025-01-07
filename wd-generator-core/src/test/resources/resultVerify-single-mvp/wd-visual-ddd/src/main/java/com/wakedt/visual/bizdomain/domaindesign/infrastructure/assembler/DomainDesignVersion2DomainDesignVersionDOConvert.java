package com.wakedt.visual.bizdomain.domaindesign.infrastructure.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.domaindesign.domain.domaindesignversion.DomainDesignVersion;
import com.wakedt.visual.bizdomain.domaindesign.infrastructure.repository.model.DomainDesignVersionDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface DomainDesignVersion2DomainDesignVersionDOConvert extends BaseConvert<DomainDesignVersion, DomainDesignVersionDO> {

    DomainDesignVersion2DomainDesignVersionDOConvert INSTANCE = Mappers.getMapper(DomainDesignVersion2DomainDesignVersionDOConvert.class);

}
