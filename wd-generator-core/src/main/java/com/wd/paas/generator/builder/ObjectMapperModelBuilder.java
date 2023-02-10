package com.wd.paas.generator.builder;

import com.wd.paas.dsl.ObjectMapperModelDsl;
import com.wd.paas.generator.builder.convert.ObjectMapperModelDslConvert;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import com.wd.paas.generator.generate.element.ObjectMapperModelNode;
import com.wd.paas.generator.generate.element.ElementNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ObjectMapperModelBuilder {
    public static ObjectMapperModelNode build(ObjectMapperModelDsl objectMapperModelDsl, BusinessDomainNode astBusinessDomain) {
        ObjectMapperModelNode objectMapperModel = ObjectMapperModelDslConvert.INSTANCE.dto2Do(objectMapperModelDsl);

        List<ElementNode> elements = new ArrayList<>();
        Optional.ofNullable(objectMapperModelDsl.getObjectMapperDsl()).ifPresent(e -> e.stream().map(objectMapperDsl -> ObjectMapperBuilder.build(objectMapperDsl, astBusinessDomain)).forEach(elements::add));
        objectMapperModel.addAll(elements);
        objectMapperModel.setParentNode(astBusinessDomain);
        return objectMapperModel;
    }
}