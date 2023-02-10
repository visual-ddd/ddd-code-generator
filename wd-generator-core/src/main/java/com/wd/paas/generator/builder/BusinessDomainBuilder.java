package com.wd.paas.generator.builder;

import com.wd.paas.dsl.BusinessDomainDsl;
import com.wd.paas.generator.builder.convert.BusinessDomainDslConvert;
import com.wd.paas.generator.generate.element.ApplicationNode;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import com.wd.paas.generator.generate.element.ElementNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BusinessDomainBuilder {

    public static BusinessDomainNode build(BusinessDomainDsl businessDomainDsl, ApplicationNode astApplication) {
        BusinessDomainNode astBusinessDomain = BusinessDomainDslConvert.INSTANCE.dto2Do(businessDomainDsl);

        List<ElementNode> elements = new ArrayList<>();
        Optional.ofNullable(businessDomainDsl.getObjectMapperModel()).map(objectMapperModelDsl -> ObjectMapperModelBuilder.build(objectMapperModelDsl, astBusinessDomain)).ifPresent(elements::add);
        Optional.ofNullable(businessDomainDsl.getDomainModel()).map(domainModelDsl -> DomainModelBuilder.build(domainModelDsl, astBusinessDomain)).ifPresent(elements::add);
        Optional.ofNullable(businessDomainDsl.getDataModel()).map(dataModelDsl -> DataModelBuilder.build(dataModelDsl, astBusinessDomain)).ifPresent(elements::add);
        Optional.ofNullable(businessDomainDsl.getQueryModel()).map(queryModelDsl -> QueryModelBuilder.build(queryModelDsl, astBusinessDomain)).ifPresent(elements::add);
        astBusinessDomain.addAll(elements);
        astBusinessDomain.setParentNode(astApplication);
        return astBusinessDomain;
    }

}
