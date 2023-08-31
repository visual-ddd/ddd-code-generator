package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.BusinessSceneVersionBindDTO;
import com.wakedt.visual.domain.application.applicationversion.businesssceneversionbind.BusinessSceneVersionBindCmd;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;

/**
 * BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert extends BaseConvert<BusinessSceneVersionBindDTO, BusinessSceneVersionBindCmd> {

    BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert INSTANCE = Mappers.getMapper(BusinessSceneVersionBindDTO2BusinessSceneVersionBindCmdConvert.class);
}