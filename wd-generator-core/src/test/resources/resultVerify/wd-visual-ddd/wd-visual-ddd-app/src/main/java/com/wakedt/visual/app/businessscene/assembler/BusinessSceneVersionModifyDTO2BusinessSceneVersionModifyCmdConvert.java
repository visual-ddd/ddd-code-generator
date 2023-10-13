package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionModifyDTO;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversionmodify.BusinessSceneVersionModifyCmd;
import com.wakedt.visual.domain.businessscene.businesssceneversion.VersionStateConverter;

/**
 * BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert extends BaseConvert<BusinessSceneVersionModifyDTO, BusinessSceneVersionModifyCmd> {

    BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionModifyDTO2BusinessSceneVersionModifyCmdConvert.class);
}