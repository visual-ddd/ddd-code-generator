package com.wakedt.visual.infrastructure.universallanguage.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.universallanguage.universallanguage.UniversalLanguage;
import com.wakedt.visual.infrastructure.universallanguage.repository.model.UniversalLanguageDO;
import com.wakedt.visual.infrastructure.universallanguage.assembler.LanguageTypeConverter;

/**
 * UniversalLanguage2UniversalLanguageDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        LanguageTypeConverter.class,
})
public interface UniversalLanguage2UniversalLanguageDOConvert extends BaseConvert<UniversalLanguage, UniversalLanguageDO> {

    UniversalLanguage2UniversalLanguageDOConvert INSTANCE = Mappers.getMapper(UniversalLanguage2UniversalLanguageDOConvert.class);

}
