package com.wakedt.visual.infrastructure.businessscene.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.businessscene.businesssceneversion.BusinessSceneVersion;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneVersionDO;
import com.wakedt.visual.domain.businessscene.businesssceneversion.VersionStateConverter;

/**
 * BusinessSceneVersion2BusinessSceneVersionDOConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersion2BusinessSceneVersionDOConvert extends BaseConvert<BusinessSceneVersion, BusinessSceneVersionDO> {

    BusinessSceneVersion2BusinessSceneVersionDOConvert INSTANCE = Mappers.getMapper(BusinessSceneVersion2BusinessSceneVersionDOConvert.class);

}
