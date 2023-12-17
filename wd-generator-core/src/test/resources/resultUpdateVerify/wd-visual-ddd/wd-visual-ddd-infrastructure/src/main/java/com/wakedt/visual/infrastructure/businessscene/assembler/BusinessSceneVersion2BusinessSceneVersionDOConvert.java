package com.wakedt.visual.infrastructure.businessscene.assembler;

import com.wakedt.visual.domain.businessscene.businesssceneversion.BusinessSceneVersion;
import com.wakedt.visual.domain.businessscene.businesssceneversion.VersionStateConverter;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.infrastructure.businessscene.repository.model.BusinessSceneVersionDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * BusinessSceneVersion2BusinessSceneVersionDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersion2BusinessSceneVersionDOConvert extends BaseConvert<BusinessSceneVersion, BusinessSceneVersionDO> {

    BusinessSceneVersion2BusinessSceneVersionDOConvert INSTANCE = Mappers.getMapper(BusinessSceneVersion2BusinessSceneVersionDOConvert.class);

}
