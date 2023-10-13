package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.businessscene.query.BusinessSceneCreateDTO;
import com.wakedt.visual.domain.businessscene.businessscene.businessscenecreate.BusinessSceneCreateCmd;

/**
 * BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert extends BaseConvert<BusinessSceneCreateDTO, BusinessSceneCreateCmd> {

    BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneCreateDTO2BusinessSceneCreateCmdConvert.class);
}