package com.wd.paas.generator.builder;

import com.wd.paas.dsl.QueryDsl;
import com.wd.paas.generator.builder.convert.QueryDslConvert;
import com.wd.paas.generator.generate.element.ASTQuery;
import com.wd.paas.generator.generate.element.ASTQueryModel;

public class QueryBuilder {

    static ASTQuery build(QueryDsl queryDsl, ASTQueryModel queryModel) {
        ASTQuery astQuery = QueryDslConvert.INSTANCE.dto2Do(queryDsl);
        astQuery.setParentNode(queryModel);
        return astQuery;
    }
}
