package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.client.businessscene.query.BusinessSceneModifyDTO;
import com.wakedt.visual.domain.businessscene.businessscene.businessscenemodify.BusinessSceneModifyCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert extends BaseConvert<BusinessSceneModifyDTO, BusinessSceneModifyCmd> {

    BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneModifyDTO2BusinessSceneModifyCmdConvert.class);
}