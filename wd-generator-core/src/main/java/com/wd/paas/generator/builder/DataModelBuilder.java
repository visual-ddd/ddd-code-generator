package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DataModelDsl;
import com.wd.paas.generator.builder.convert.DataModelDslConvert;
import com.wd.paas.generator.generate.element.ASTDataModel;
import com.wd.paas.generator.generate.element.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataModelBuilder {
    static ASTDataModel build(DataModelDsl dataModelDsl) {

        List<Element> elements = new ArrayList<>();
        Optional.ofNullable(dataModelDsl.getDataObjectList()).ifPresent(e -> e.stream().map(DataObjectBuilder::build).forEach(elements::add));
        Optional.ofNullable(dataModelDsl.getDataObjectReferenceList()).ifPresent(e -> e.stream().map(DataObjectReferenceBuilder::build).forEach(elements::add));
        ASTDataModel astDataModel = DataModelDslConvert.INSTANCE.dto2Do(dataModelDsl);
        astDataModel.addAll(elements);
        return astDataModel;
    }
}