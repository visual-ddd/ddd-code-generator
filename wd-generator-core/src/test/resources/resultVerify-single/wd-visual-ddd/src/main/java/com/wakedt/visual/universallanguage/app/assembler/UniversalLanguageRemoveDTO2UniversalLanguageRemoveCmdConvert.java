package com.wakedt.visual.universallanguage.app.assembler;

import com.wakedt.visual.universallanguage.infrastructure.BaseConvert;
import com.wakedt.visual.universallanguage.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.universallanguage.client.query.UniversalLanguageRemoveDTO;
import com.wakedt.visual.universallanguage.app.cmd.remove.UniversalLanguageRemoveCmd;
import com.wakedt.visual.universallanguage.domain.universallanguage.LanguageTypeConverter;

@Mapper(uses = {
        BaseJsonConvertor.class,
        LanguageTypeConverter.class,
})
public interface UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert extends BaseConvert<UniversalLanguageRemoveDTO, UniversalLanguageRemoveCmd> {

    UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert INSTANCE = Mappers.getMapper(UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert.class);
}