package com.wakedt.visual.bizdomain.universallanguage.infrastructure.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.bizdomain.universallanguage.domain.universallanguage.UniversalLanguage;
import com.wakedt.visual.bizdomain.universallanguage.infrastructure.repository.model.UniversalLanguageDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface UniversalLanguage2UniversalLanguageDOConvert extends BaseConvert<UniversalLanguage, UniversalLanguageDO> {

    UniversalLanguage2UniversalLanguageDOConvert INSTANCE = Mappers.getMapper(UniversalLanguage2UniversalLanguageDOConvert.class);

}
