package com.wakedt.visual.bizdomain.businessscene.infrastructure.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.businessscene.domain.businessscene.BusinessScene;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessScene2BusinessSceneDOConvert extends BaseConvert<BusinessScene, BusinessSceneDO> {

    BusinessScene2BusinessSceneDOConvert INSTANCE = Mappers.getMapper(BusinessScene2BusinessSceneDOConvert.class);

}
