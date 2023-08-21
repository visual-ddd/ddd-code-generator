package com.wakedt.visual.application.app.assembler;

import com.wakedt.visual.application.infrastructure.BaseConvert;
import com.wakedt.visual.application.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.application.client.query.ApplicationModifyDTO;
import com.wakedt.visual.application.app.cmd.applicationmodify.ApplicationModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationModifyDTO2ApplicationModifyCmdConvert extends BaseConvert<ApplicationModifyDTO, ApplicationModifyCmd> {

    ApplicationModifyDTO2ApplicationModifyCmdConvert INSTANCE = Mappers.getMapper(ApplicationModifyDTO2ApplicationModifyCmdConvert.class);
}