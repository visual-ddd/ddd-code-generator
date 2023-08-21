package com.wakedt.visual.application.app.assembler;

import com.wakedt.visual.application.infrastructure.BaseConvert;
import com.wakedt.visual.application.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.application.client.query.ApplicationVersionModifyDTO;
import com.wakedt.visual.application.app.cmd.applicationversionmodify.ApplicationVersionModifyCmd;
import com.wakedt.visual.application.domain.applicationversion.VersionStateConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        VersionStateConverter.class,
})
public interface ApplicationVersionModifyDTO2ApplicationVersionModifyCmdConvert extends BaseConvert<ApplicationVersionModifyDTO, ApplicationVersionModifyCmd> {

    ApplicationVersionModifyDTO2ApplicationVersionModifyCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionModifyDTO2ApplicationVersionModifyCmdConvert.class);
}