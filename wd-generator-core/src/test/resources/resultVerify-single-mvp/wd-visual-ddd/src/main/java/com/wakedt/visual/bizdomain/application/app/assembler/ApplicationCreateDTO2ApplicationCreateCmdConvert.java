package com.wakedt.visual.bizdomain.application.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationCreateDTO;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationcreate.ApplicationCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationCreateDTO2ApplicationCreateCmdConvert extends BaseConvert<ApplicationCreateDTO, ApplicationCreateCmd> {

    ApplicationCreateDTO2ApplicationCreateCmdConvert INSTANCE = Mappers.getMapper(ApplicationCreateDTO2ApplicationCreateCmdConvert.class);
}