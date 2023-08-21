package com.wakedt.visual.app.universallanguage.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import com.wakedt.visual.infrastructure.BaseJsonConvertor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;
import com.wakedt.visual.client.universallanguage.dto.UniversalLanguageDTO;
import com.wakedt.visual.infrastructure.universallanguage.repository.model.UniversalLanguageDO;

@Mapper(uses = {
        BaseJsonConvertor.class,
})
public interface UniversalLanguageDTO2UniversalLanguageDOConvert extends BaseConvert<UniversalLanguageDTO, UniversalLanguageDO> {

    UniversalLanguageDTO2UniversalLanguageDOConvert INSTANCE = Mappers.getMapper(UniversalLanguageDTO2UniversalLanguageDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "conception", target = "conception")
    @Mapping(source = "englishName", target = "englishName")
    @Mapping(source = "definition", target = "definition")
    @Mapping(source = "languageType", target = "languageType")
    @Mapping(source = "restraint", target = "restraint")
    @Mapping(source = "example", target = "example")
    @Mapping(source = "identity", target = "identity")
    @Override
    UniversalLanguageDO dto2Do(UniversalLanguageDTO dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "conception", target = "conception")
    @Mapping(source = "englishName", target = "englishName")
    @Mapping(source = "definition", target = "definition")
    @Mapping(source = "languageType", target = "languageType")
    @Mapping(source = "restraint", target = "restraint")
    @Mapping(source = "example", target = "example")
    @Mapping(source = "identity", target = "identity")
    @Override
    UniversalLanguageDTO do2Dto(UniversalLanguageDO d);
}