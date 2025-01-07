package com.wakedt.visual.bizdomain.businessscene.infrastructure.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.businessscene.domain.businesssceneversion.BusinessSceneVersion;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneVersionDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneVersion2BusinessSceneVersionDOConvert extends BaseConvert<BusinessSceneVersion, BusinessSceneVersionDO> {

    BusinessSceneVersion2BusinessSceneVersionDOConvert INSTANCE = Mappers.getMapper(BusinessSceneVersion2BusinessSceneVersionDOConvert.class);

}
