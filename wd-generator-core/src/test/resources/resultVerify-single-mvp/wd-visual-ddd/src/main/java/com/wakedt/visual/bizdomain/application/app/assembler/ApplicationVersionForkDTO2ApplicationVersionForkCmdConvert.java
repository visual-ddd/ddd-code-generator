package com.wakedt.visual.bizdomain.application.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionForkDTO;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationversionfork.ApplicationVersionForkCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationVersionForkDTO2ApplicationVersionForkCmdConvert extends BaseConvert<ApplicationVersionForkDTO, ApplicationVersionForkCmd> {

    ApplicationVersionForkDTO2ApplicationVersionForkCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionForkDTO2ApplicationVersionForkCmdConvert.class);
}