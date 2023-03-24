package com.wakedt.visual.app.universallanguage.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageRemoveDTO;
import com.wakedt.visual.domain.universallanguage.universallanguage.remove.UniversalLanguageRemoveCmd;
import com.wakedt.visual.domain.universallanguage.universallanguage.LanguageTypeConverter;

@Mapper(uses = {
        LanguageTypeConverter.class,
        JsonConverter.class,
})
public interface UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert extends BaseConvert<UniversalLanguageRemoveDTO, UniversalLanguageRemoveCmd> {

    UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert INSTANCE = Mappers.getMapper(UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert.class);
}