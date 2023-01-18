package com.wd.paas.generator.builder;

import com.wd.paas.dsl.QueryDsl;
import com.wd.paas.generator.builder.convert.QueryDslConvert;
import com.wd.paas.generator.generate.element.ASTQuery;

public class QueryBuilder {

    static ASTQuery build(QueryDsl queryDsl) {
        return QueryDslConvert.INSTANCE.dto2Do(queryDsl);
    }
}
