package com.wakedt.visual.universallanguage.app.assembler;

import com.wakedt.visual.universallanguage.app.cmd.create.UniversalLanguageCreateCmd;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageCreateDTO;
import com.wakedt.visual.universallanguage.domain.universallanguage.LanguageTypeConverter;
import com.wakedt.visual.universallanguage.infrastructure.BaseConvert;
import com.wakedt.visual.universallanguage.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
        LanguageTypeConverter.class,
})
public interface UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert extends BaseConvert<UniversalLanguageCreateDTO, UniversalLanguageCreateCmd> {

    UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert INSTANCE = Mappers.getMapper(UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert.class);
}