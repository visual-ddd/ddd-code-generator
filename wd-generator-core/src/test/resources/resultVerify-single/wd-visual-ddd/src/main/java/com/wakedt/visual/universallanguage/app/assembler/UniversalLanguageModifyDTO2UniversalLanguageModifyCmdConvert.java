package com.wakedt.visual.universallanguage.app.assembler;

import com.wakedt.visual.universallanguage.infrastructure.BaseConvert;
import com.wakedt.visual.universallanguage.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageModifyDTO;
import com.wakedt.visual.universallanguage.app.cmd.modify.UniversalLanguageModifyCmd;
import com.wakedt.visual.universallanguage.domain.universallanguage.LanguageTypeConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        LanguageTypeConverter.class,
})
public interface UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert extends BaseConvert<UniversalLanguageModifyDTO, UniversalLanguageModifyCmd> {

    UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert INSTANCE = Mappers.getMapper(UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert.class);
}