package com.wakedt.visual.bizdomain.application.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionPublishDTO;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationversionpublish.ApplicationVersionPublishCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert extends BaseConvert<ApplicationVersionPublishDTO, ApplicationVersionPublishCmd> {

    ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionPublishDTO2ApplicationVersionPublishCmdConvert.class);
}