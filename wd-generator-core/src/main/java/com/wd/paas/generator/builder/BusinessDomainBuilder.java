package com.wd.paas.generator.builder;

import com.wd.paas.dsl.BusinessDomainDsl;
import com.wd.paas.generator.builder.convert.BusinessDomainDslConvert;
import com.wd.paas.generator.generate.element.BusinessDomain;
import com.wd.paas.generator.generate.element.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BusinessDomainBuilder {

    public static BusinessDomain build(BusinessDomainDsl businessDomainDsl) {
        BusinessDomain businessDomain = BusinessDomainDslConvert.INSTANCE.dto2Do(businessDomainDsl);

        List<Element> elements = new ArrayList<>();
        Optional.ofNullable(businessDomainDsl.getDomainModel()).map(DomainModelBuilder::build).ifPresent(elements::add);
        Optional.ofNullable(businessDomainDsl.getDataModel()).map(DataModelBuilder::build).ifPresent(elements::add);
        Optional.ofNullable(businessDomainDsl.getQueryModel()).map(QueryModelBuilder::build).ifPresent(elements::add);
        Optional.ofNullable(businessDomainDsl.getObjectMapperModel()).map(ObjectMapperModelBuilder::build).ifPresent(elements::add);
        businessDomain.addAll(elements);
        return businessDomain;
    }

}
