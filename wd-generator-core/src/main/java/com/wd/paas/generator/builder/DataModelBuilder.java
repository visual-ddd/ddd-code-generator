package com.wd.paas.generator.builder;

import com.wd.paas.dsl.DataModelDsl;
import com.wd.paas.generator.builder.convert.DataModelDslConvert;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import com.wd.paas.generator.generate.element.DataModelNode;
import com.wd.paas.generator.generate.element.ElementNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataModelBuilder {
    static DataModelNode build(DataModelDsl dataModelDsl, BusinessDomainNode astBusinessDomain) {
        DataModelNode astDataModel = DataModelDslConvert.INSTANCE.dto2Do(dataModelDsl);

        List<ElementNode> elements = new ArrayList<>();
        Optional.ofNullable(dataModelDsl.getDataObjectList()).ifPresent(e -> e.stream().map(dataObjectDsl -> DataObjectBuilder.build(dataObjectDsl,astBusinessDomain)).forEach(elements::add));
        astDataModel.addAll(elements);
        astDataModel.setParentNode(astBusinessDomain);
        return astDataModel;
    }
}