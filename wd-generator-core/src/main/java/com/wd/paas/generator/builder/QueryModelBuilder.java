package com.wd.paas.generator.builder;

import com.wd.paas.dsl.QueryModelDsl;
import com.wd.paas.generator.builder.convert.QueryModelDslConvert;
import com.wd.paas.generator.generate.element.ASTQueryModel;
import com.wd.paas.generator.generate.element.ElementNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class QueryModelBuilder {

    static ASTQueryModel build(QueryModelDsl queryModelDsl) {
        List<ElementNode> elements = new ArrayList<>();
        Optional.ofNullable(queryModelDsl.getQueryDslList()).ifPresent(e -> e.stream().map(QueryBuilder::build).forEach(elements::add));
        Optional.ofNullable(queryModelDsl.getDtoDslList()).ifPresent(e -> e.stream().map(DTOBuilder::build).forEach(elements::add));
        ASTQueryModel queryModel = QueryModelDslConvert.INSTANCE.dto2Do(queryModelDsl);
        queryModel.addAll(elements);
        return queryModel;
    }
}