package com.wakedt.visual.bizdomain.application.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationModifyDTO;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationmodify.ApplicationModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationModifyDTO2ApplicationModifyCmdConvert extends BaseConvert<ApplicationModifyDTO, ApplicationModifyCmd> {

    ApplicationModifyDTO2ApplicationModifyCmdConvert INSTANCE = Mappers.getMapper(ApplicationModifyDTO2ApplicationModifyCmdConvert.class);
}