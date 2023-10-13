package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.ApplicationCreateDTO;
import com.wakedt.visual.domain.application.application.applicationcreate.ApplicationCreateCmd;

/**
 * ApplicationCreateDTO2ApplicationCreateCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationCreateDTO2ApplicationCreateCmdConvert extends BaseConvert<ApplicationCreateDTO, ApplicationCreateCmd> {

    ApplicationCreateDTO2ApplicationCreateCmdConvert INSTANCE = Mappers.getMapper(ApplicationCreateDTO2ApplicationCreateCmdConvert.class);
}