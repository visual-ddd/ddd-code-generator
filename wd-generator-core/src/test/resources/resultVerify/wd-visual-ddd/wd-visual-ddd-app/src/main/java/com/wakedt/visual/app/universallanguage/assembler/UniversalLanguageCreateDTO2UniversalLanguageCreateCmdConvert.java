package com.wakedt.visual.app.universallanguage.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.client.universallanguage.query.UniversalLanguageCreateDTO;
import com.wakedt.visual.domain.universallanguage.universallanguage.create.UniversalLanguageCreateCmd;
import com.wakedt.visual.domain.universallanguage.universallanguage.LanguageTypeConverter;

/**
 * UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        LanguageTypeConverter.class,
})
public interface UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert extends BaseConvert<UniversalLanguageCreateDTO, UniversalLanguageCreateCmd> {

    UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert INSTANCE = Mappers.getMapper(UniversalLanguageCreateDTO2UniversalLanguageCreateCmdConvert.class);
}