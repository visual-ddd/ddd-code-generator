package com.wakedt.visual.bizdomain.application.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionRemoveDTO;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationversionremove.ApplicationVersionRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert extends BaseConvert<ApplicationVersionRemoveDTO, ApplicationVersionRemoveCmd> {

    ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionRemoveDTO2ApplicationVersionRemoveCmdConvert.class);
}