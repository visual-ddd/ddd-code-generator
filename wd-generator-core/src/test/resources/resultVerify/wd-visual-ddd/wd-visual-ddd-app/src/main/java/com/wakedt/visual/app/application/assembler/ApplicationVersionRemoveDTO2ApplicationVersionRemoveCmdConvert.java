package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.ApplicationVersionRemoveDTO;
import com.wakedt.visual.domain.application.applicationversion.applicationversionremove.ApplicationVersionRemoveCmd;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;

/**
 * ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert extends BaseConvert<ApplicationVersionRemoveDTO, ApplicationVersionRemoveCmd> {

    ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert.class);
}