package com.wakedt.visual.app.universallanguage.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageRemoveDTO;
import com.wakedt.visual.domain.universallanguage.universallanguage.remove.UniversalLanguageRemoveCmd;
import com.wakedt.visual.infrastructure.universallanguage.assembler.LanguageTypeConverter;

/**
 * UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        LanguageTypeConverter.class,
})
public interface UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert extends BaseConvert<UniversalLanguageRemoveDTO, UniversalLanguageRemoveCmd> {

    UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert INSTANCE = Mappers.getMapper(UniversalLanguageRemoveDTO2UniversalLanguageRemoveCmdConvert.class);
}