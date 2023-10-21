package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneDTO;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneDO;

/**
 * BusinessSceneDTO2BusinessSceneDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneDTO2BusinessSceneDOConvert extends BaseConvert<BusinessSceneDTO, BusinessSceneDO> {

    BusinessSceneDTO2BusinessSceneDOConvert INSTANCE = Mappers.getMapper(BusinessSceneDTO2BusinessSceneDOConvert.class);

}