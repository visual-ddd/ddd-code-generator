package com.wd.paas.generator.builder;

import com.wd.paas.dsl.QueryModelDsl;
import com.wd.paas.generator.builder.convert.BusinessServiceModelDslConvert;
import com.wd.paas.generator.generate.element.BusinessScenarioNode;
import com.wd.paas.generator.generate.element.BusinessServiceModelNode;
import com.wd.paas.generator.generate.element.ElementNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BusinessServiceModelBuilder {

    public static BusinessServiceModelNode build(QueryModelDsl queryModelDsl, BusinessScenarioNode businessScenarioNode) {
        BusinessServiceModelNode businessServiceModelNode = BusinessServiceModelDslConvert.INSTANCE.dto2Do(queryModelDsl);

        List<ElementNode> elements = new ArrayList<>();
        Optional.ofNullable(queryModelDsl.getQueryDslList()).ifPresent(e -> e.stream().map(queryDsl -> BusinessQueryBuilder.build(queryDsl, businessServiceModelNode)).forEach(elements::add));
        Optional.ofNullable(queryModelDsl.getDtoDslList()).ifPresent(e -> e.stream().map(dtoDsl -> BusinessDTOBuilder.build(dtoDsl, businessServiceModelNode)).forEach(elements::add));
        businessServiceModelNode.addAll(elements);
        businessServiceModelNode.setParentNode(businessScenarioNode);
        return businessServiceModelNode;
    }

}
