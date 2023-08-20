package com.wakedt.visual.app.application.assembler;

import com.wakedt.visual.client.application.query.ApplicationRemoveDTO;
import com.wakedt.visual.domain.application.application.applicationremove.ApplicationRemoveCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationRemoveDTO2ApplicationRemoveCmdConvert extends BaseConvert<ApplicationRemoveDTO, ApplicationRemoveCmd> {

    ApplicationRemoveDTO2ApplicationRemoveCmdConvert INSTANCE = Mappers.getMapper(ApplicationRemoveDTO2ApplicationRemoveCmdConvert.class);
}