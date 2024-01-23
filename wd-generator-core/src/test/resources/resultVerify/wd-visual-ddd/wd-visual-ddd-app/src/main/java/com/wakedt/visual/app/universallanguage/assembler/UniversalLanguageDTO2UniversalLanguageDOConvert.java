package com.wakedt.visual.app.universallanguage.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.universallanguage.dto.UniversalLanguageDTO;
import com.wakedt.visual.infrastructure.universallanguage.repository.model.UniversalLanguageDO;

/**
 * UniversalLanguageDTO2UniversalLanguageDOConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        UniversalLanguageDTOConverter.class,
})
public interface UniversalLanguageDTO2UniversalLanguageDOConvert extends BaseConvert<UniversalLanguageDTO, UniversalLanguageDO> {

    UniversalLanguageDTO2UniversalLanguageDOConvert INSTANCE = Mappers.getMapper(UniversalLanguageDTO2UniversalLanguageDOConvert.class);

}