package com.wakedt.visual.infrastructure.businessscene.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.businessscene.businessscene.BusinessScene;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneDO;

/**
 * BusinessScene2BusinessSceneDOConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessScene2BusinessSceneDOConvert extends BaseConvert<BusinessScene, BusinessSceneDO> {

    BusinessScene2BusinessSceneDOConvert INSTANCE = Mappers.getMapper(BusinessScene2BusinessSceneDOConvert.class);

}
