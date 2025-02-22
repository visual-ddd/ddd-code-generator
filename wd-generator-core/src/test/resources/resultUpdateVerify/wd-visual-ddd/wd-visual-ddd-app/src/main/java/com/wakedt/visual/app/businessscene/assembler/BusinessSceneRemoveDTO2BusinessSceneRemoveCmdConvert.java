package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.client.businessscene.query.BusinessSceneRemoveDTO;
import com.wakedt.visual.domain.businessscene.businessscene.businesssceneremove.BusinessSceneRemoveCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert extends BaseConvert<BusinessSceneRemoveDTO, BusinessSceneRemoveCmd> {

    BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneRemoveDTO2BusinessSceneRemoveCmdConvert.class);
}