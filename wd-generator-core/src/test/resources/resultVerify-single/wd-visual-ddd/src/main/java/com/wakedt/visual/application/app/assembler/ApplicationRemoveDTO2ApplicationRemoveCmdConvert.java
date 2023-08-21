package com.wakedt.visual.application.app.assembler;

import com.wakedt.visual.application.infrastructure.BaseConvert;
import com.wakedt.visual.application.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.application.client.query.ApplicationRemoveDTO;
import com.wakedt.visual.application.app.cmd.applicationremove.ApplicationRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationRemoveDTO2ApplicationRemoveCmdConvert extends BaseConvert<ApplicationRemoveDTO, ApplicationRemoveCmd> {

    ApplicationRemoveDTO2ApplicationRemoveCmdConvert INSTANCE = Mappers.getMapper(ApplicationRemoveDTO2ApplicationRemoveCmdConvert.class);
}