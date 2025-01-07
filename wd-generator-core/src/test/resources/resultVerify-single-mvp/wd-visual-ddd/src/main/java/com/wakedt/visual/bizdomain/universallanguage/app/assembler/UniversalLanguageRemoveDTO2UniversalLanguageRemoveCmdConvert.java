package com.wakedt.visual.bizdomain.universallanguage.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageRemoveDTO;
import com.wakedt.visual.bizdomain.universallanguage.app.cmd.remove.UniversalLanguageRemoveCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert extends BaseConvert<UniversalLanguageRemoveDTO, UniversalLanguageRemoveCmd> {

    UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert INSTANCE = Mappers.getMapper(UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert.class);
}