package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.client.application.query.ApplicationModifyDTO;
import com.wakedt.visual.domain.application.application.applicationmodify.ApplicationModifyCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * ApplicationModifyDTO2ApplicationModifyCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationModifyDTO2ApplicationModifyCmdConvert extends BaseConvert<ApplicationModifyDTO, ApplicationModifyCmd> {

    ApplicationModifyDTO2ApplicationModifyCmdConvert INSTANCE = Mappers.getMapper(ApplicationModifyDTO2ApplicationModifyCmdConvert.class);
}