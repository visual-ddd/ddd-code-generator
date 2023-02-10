package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DataModelDsl;
import com.wd.paas.generator.builder.convert.DataModelDslConvert;
import com.wd.paas.generator.generate.element.ASTBusinessDomain;
import com.wd.paas.generator.generate.element.ASTDataModel;
import com.wd.paas.generator.generate.element.ElementNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataModelBuilder {
    static ASTDataModel build(DataModelDsl dataModelDsl, ASTBusinessDomain astBusinessDomain) {
        ASTDataModel astDataModel = DataModelDslConvert.INSTANCE.dto2Do(dataModelDsl);

        List<ElementNode> elements = new ArrayList<>();
        Optional.ofNullable(dataModelDsl.getDataObjectList()).ifPresent(e -> e.stream().map(dataObjectDsl -> DataObjectBuilder.build(dataObjectDsl,astBusinessDomain)).forEach(elements::add));
        astDataModel.addAll(elements);
        astDataModel.setParentNode(astBusinessDomain);
        return astDataModel;
    }
}