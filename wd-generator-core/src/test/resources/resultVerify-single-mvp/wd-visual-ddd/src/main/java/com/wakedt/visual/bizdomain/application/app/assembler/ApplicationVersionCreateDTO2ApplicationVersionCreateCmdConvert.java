package com.wakedt.visual.bizdomain.application.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionCreateDTO;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationversioncreate.ApplicationVersionCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationVersionCreateDTO2ApplicationVersionCreateCmdConvert extends BaseConvert<ApplicationVersionCreateDTO, ApplicationVersionCreateCmd> {

    ApplicationVersionCreateDTO2ApplicationVersionCreateCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionCreateDTO2ApplicationVersionCreateCmdConvert.class);
}