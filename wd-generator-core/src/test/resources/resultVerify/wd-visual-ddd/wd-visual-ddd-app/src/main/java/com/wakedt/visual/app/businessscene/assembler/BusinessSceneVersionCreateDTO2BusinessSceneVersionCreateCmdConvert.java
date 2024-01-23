package com.wakedt.visual.app.businessscene.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.businessscene.query.BusinessSceneVersionCreateDTO;
import com.wakedt.visual.domain.businessscene.businesssceneversion.businesssceneversioncreate.BusinessSceneVersionCreateCmd;
import com.wakedt.visual.infrastructure.businessscene.assembler.VersionStateConverter;

/**
 * BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert extends BaseConvert<BusinessSceneVersionCreateDTO, BusinessSceneVersionCreateCmd> {

    BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionCreateDTO2BusinessSceneVersionCreateCmdConvert.class);
}