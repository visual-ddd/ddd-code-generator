package com.wakedt.visual.bizdomain.businessscene.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.bizdomain.businessscene.client.response.BusinessSceneDTO;
import com.wakedt.visual.bizdomain.businessscene.infrastructure.repository.model.BusinessSceneDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneDTO2BusinessSceneDOConvert extends BaseConvert<BusinessSceneDTO, BusinessSceneDO> {

    BusinessSceneDTO2BusinessSceneDOConvert INSTANCE = Mappers.getMapper(BusinessSceneDTO2BusinessSceneDOConvert.class);

}