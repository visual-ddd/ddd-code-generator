package com.wakedt.visual.universallanguage.infrastructure.assembler;

import com.wakedt.visual.universallanguage.domain.universallanguage.LanguageTypeConverter;
import com.wakedt.visual.universallanguage.domain.universallanguage.UniversalLanguage;
import com.wakedt.visual.universallanguage.infrastructure.BaseConvert;
import com.wakedt.visual.universallanguage.infrastructure.BaseJsonConvertor;
import com.wakedt.visual.universallanguage.infrastructure.repository.model.UniversalLanguageDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {
        BaseJsonConvertor.class,
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
