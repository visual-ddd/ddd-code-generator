package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.client.businessscene.query.BusinessSceneCreateDTO;
import com.wakedt.visual.domain.businessscene.businessscene.businessscenecreate.BusinessSceneCreateCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert extends BaseConvert<BusinessSceneCreateDTO, BusinessSceneCreateCmd> {

    BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert.class);
}