package com.wakedt.visual.app.universallanguage.assembler;

import com.wakedt.visual.client.universallanguage.query.UniversalLanguageModifyDTO;
import com.wakedt.visual.domain.universallanguage.universallanguage.LanguageTypeConverter;
import com.wakedt.visual.domain.universallanguage.universallanguage.modify.UniversalLanguageModifyCmd;
import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert
 *
 * @author shimmer
 * @since 1.0
 */
@Mapper(uses = {
        BaseJsonConvertor.class,
        LanguageTypeConverter.class,
})
public interface UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert extends BaseConvert<UniversalLanguageModifyDTO, UniversalLanguageModifyCmd> {

    UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert INSTANCE = Mappers.getMapper(UniversalLanguageModifyDTO2UniversalLanguageModifyCmdConvert.class);
}