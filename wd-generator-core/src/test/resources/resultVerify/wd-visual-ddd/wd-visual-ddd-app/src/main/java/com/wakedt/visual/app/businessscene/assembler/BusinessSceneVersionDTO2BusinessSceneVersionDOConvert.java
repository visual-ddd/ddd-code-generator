package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.businessscene.dto.BusinessSceneVersionDTO;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneVersionDO;

/**
 * BusinessSceneVersionDTO2BusinessSceneVersionDOConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneVersionDTO2BusinessSceneVersionDOConvert extends BaseConvert<BusinessSceneVersionDTO, BusinessSceneVersionDO> {

    BusinessSceneVersionDTO2BusinessSceneVersionDOConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionDTO2BusinessSceneVersionDOConvert.class);

}