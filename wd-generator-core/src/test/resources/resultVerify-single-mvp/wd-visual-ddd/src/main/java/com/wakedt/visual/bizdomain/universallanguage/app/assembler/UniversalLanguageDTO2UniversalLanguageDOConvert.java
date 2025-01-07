package com.wakedt.visual.bizdomain.universallanguage.app.assembler;

import com.wakedata.common.core.base.BaseConvert;
import com.wakedata.common.core.base.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.bizdomain.universallanguage.client.response.UniversalLanguageDTO;
import com.wakedt.visual.bizdomain.universallanguage.infrastructure.repository.model.UniversalLanguageDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface UniversalLanguageDTO2UniversalLanguageDOConvert extends BaseConvert<UniversalLanguageDTO, UniversalLanguageDO> {

    UniversalLanguageDTO2UniversalLanguageDOConvert INSTANCE = Mappers.getMapper(UniversalLanguageDTO2UniversalLanguageDOConvert.class);

}