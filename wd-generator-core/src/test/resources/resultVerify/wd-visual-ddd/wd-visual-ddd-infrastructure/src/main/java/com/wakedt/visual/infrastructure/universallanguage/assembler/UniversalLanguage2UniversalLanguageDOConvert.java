package com.wakedt.visual.infrastructure.universallanguage.assembler;

import com.wakedt.visual.infrastructure.BaseConvert;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.wakedt.visual.domain.universallanguage.universallanguage.UniversalLanguage;
import com.wakedt.visual.infrastructure.universallanguage.repository.model.UniversalLanguageDO;
import com.wakedt.visual.domain.universallanguage.universallanguage.LanguageTypeConverter;

@Mapper(uses = {
        LanguageTypeConverter.class,
})
public interface UniversalLanguage2UniversalLanguageDOConvert extends BaseConvert<UniversalLanguage, UniversalLanguageDO> {

    UniversalLanguage2UniversalLanguageDOConvert INSTANCE = Mappers.getMapper(UniversalLanguage2UniversalLanguageDOConvert.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "conception", target = "conception")
    @Mapping(source = "englishName", target = "englishName")
    @Mapping(source = "definition", target = "definition")
    @Mapping(source = "languageType", target = "languageType")
    @Mapping(source = "restraint", target = "restraint")
    @Mapping(source = "example", target = "example")
    @Mapping(source = "identity", target = "identity")
    @Override
    UniversalLanguageDO dto2Do(UniversalLanguage dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "conception", target = "conception")
    @Mapping(source = "englishName", target = "englishName")
    @Mapping(source = "definition", target = "definition")
    @Mapping(source = "languageType", target = "languageType")
    @Mapping(source = "restraint", target = "restraint")
    @Mapping(source = "example", target = "example")
    @Mapping(source = "identity", target = "identity")
    @Override
    UniversalLanguage do2Dto(UniversalLanguageDO d);
}
