package com.wakedt.visual.bizdomain.universallanguage.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.universallanguage.client.request.UniversalLanguageCreateDTO;
import com.wakedt.visual.bizdomain.universallanguage.app.cmd.create.UniversalLanguageCreateCmd;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert extends BaseConvert<UniversalLanguageCreateDTO, UniversalLanguageCreateCmd> {

    UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert INSTANCE = Mappers.getMapper(UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert.class);
}