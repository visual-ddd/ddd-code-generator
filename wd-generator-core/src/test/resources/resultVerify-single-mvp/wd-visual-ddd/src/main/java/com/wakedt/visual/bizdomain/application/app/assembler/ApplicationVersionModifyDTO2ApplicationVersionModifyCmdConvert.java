package com.wakedt.visual.bizdomain.application.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.application.client.request.ApplicationVersionModifyDTO;
import com.wakedt.visual.bizdomain.application.app.cmd.applicationversionmodify.ApplicationVersionModifyCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface ApplicationVersionModifyDTO2ApplicationVersionModifyCmdConvert extends BaseConvert<ApplicationVersionModifyDTO, ApplicationVersionModifyCmd> {

    ApplicationVersionModifyDTO2ApplicationVersionModifyCmdConvert INSTANCE = Mappers.getMapper(ApplicationVersionModifyDTO2ApplicationVersionModifyCmdConvert.class);
}