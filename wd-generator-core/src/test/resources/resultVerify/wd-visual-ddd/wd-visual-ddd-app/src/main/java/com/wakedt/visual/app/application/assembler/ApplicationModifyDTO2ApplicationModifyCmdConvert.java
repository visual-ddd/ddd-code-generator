package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.application.query.ApplicationModifyDTO;
import com.wakedt.visual.domain.application.application.applicationmodify.ApplicationModifyCmd;

@Mapper(uses = {
        JsonConverter.class,
})
public interface ApplicationModifyDTO2ApplicationModifyCmdConvert extends BaseConvert<ApplicationModifyDTO, ApplicationModifyCmd> {

    ApplicationModifyDTO2ApplicationModifyCmdConvert INSTANCE = Mappers.getMapper(ApplicationModifyDTO2ApplicationModifyCmdConvert.class);
}