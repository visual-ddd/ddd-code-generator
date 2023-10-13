package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.ApplicationVersionModifyDTO;
import com.wakedt.visual.domain.application.applicationversion.applicationversionmodify.ApplicationVersionModifyCmd;
import com.wakedt.visual.domain.application.applicationversion.VersionStateConverter;

/**
 * ApplicationVersionModifyDTO2ApplicationVersionModifyCmdConvert
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersionModifyDTO2ApplicationVersionModifyCmdConvert extends BaseConvert<ApplicationVersionModifyDTO, ApplicationVersionModifyCmd> {

    ApplicationVersionModifyDTO2ApplicationVersionModifyCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionModifyDTO2ApplicationVersionModifyCmdConvert.class);
}