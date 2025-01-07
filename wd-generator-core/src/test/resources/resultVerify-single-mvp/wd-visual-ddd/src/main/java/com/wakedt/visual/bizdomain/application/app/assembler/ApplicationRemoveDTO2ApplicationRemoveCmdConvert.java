package com.wakedt.visual.bizdomain.application.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationRemoveDTO;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationremove.ApplicationRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationRemoveDTO2ApplicationRemoveCmdConvert extends BaseConvert<ApplicationRemoveDTO, ApplicationRemoveCmd> {

    ApplicationRemoveDTO2ApplicationRemoveCmdConvert INSTANCE = Mappers.getMapper(ApplicationRemoveDTO2ApplicationRemoveCmdConvert.class);
}