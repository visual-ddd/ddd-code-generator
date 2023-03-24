package com.wakedt.visual.app.universallanguage.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageModifyDTO;
import com.wakedt.visual.domain.universallanguage.universallanguage.modify.UniversalLanguageModifyCmd;
import com.wakedt.visual.domain.universallanguage.universallanguage.LanguageTypeConverter;

@Mapper(uses = {
        LanguageTypeConverter.class,
        JsonConverter.class,
})
public interface UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert extends BaseConvert<UniversalLanguageModifyDTO, UniversalLanguageModifyCmd> {

    UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert INSTANCE = Mappers.getMapper(UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert.class);
}