package com.wd.paas.generator.builder;

import com.wd.paas.dsl.QueryModelDsl;
import com.wd.paas.generator.builder.convert.QueryModelDslConvert;
import com.wd.paas.generator.generate.element.BusinessDomainNode;
import com.wd.paas.generator.generate.element.QueryModelNode;
import com.wd.paas.generator.generate.element.ElementNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class QueryModelBuilder {

    static QueryModelNode build(QueryModelDsl queryModelDsl, BusinessDomainNode astBusinessDomain) {
        QueryModelNode queryModel = QueryModelDslConvert.INSTANCE.dto2Do(queryModelDsl);

        List<ElementNode> elements = new ArrayList<>();
        Optional.ofNullable(queryModelDsl.getQueryDslList()).ifPresent(e -> e.stream().map(queryDsl -> QueryBuilder.build(queryDsl, queryModel)).forEach(elements::add));
        Optional.ofNullable(queryModelDsl.getDtoDslList()).ifPresent(e -> e.stream().map(dtoDsl -> DTOBuilder.build(dtoDsl, queryModel)).forEach(elements::add));
        queryModel.addAll(elements);
        queryModel.setParentNode(astBusinessDomain);
        return queryModel;
    }
}