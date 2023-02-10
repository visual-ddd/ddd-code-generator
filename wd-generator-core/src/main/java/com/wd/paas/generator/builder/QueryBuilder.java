package com.wd.paas.generator.builder;

import com.wd.paas.dsl.QueryDsl;
import com.wd.paas.generator.builder.convert.QueryDslConvert;
import com.wd.paas.generator.generate.element.QueryNode;
import com.wd.paas.generator.generate.element.QueryModelNode;

public class QueryBuilder {

    static QueryNode build(QueryDsl queryDsl, QueryModelNode queryModel) {
        QueryNode astQuery = QueryDslConvert.INSTANCE.dto2Do(queryDsl);
        astQuery.setParentNode(queryModel);
        return astQuery;
    }
}
