package com.wd.paas.generator.builder;

import com.wd.paas.dsl.QueryDsl;
import com.wd.paas.generator.builder.convert.BusinessQueryDslConvert;
import com.wd.paas.generator.generate.element.BusinessQueryNode;
import com.wd.paas.generator.generate.element.BusinessServiceModelNode;

public class BusinessQueryBuilder {

    static BusinessQueryNode build(QueryDsl queryDsl, BusinessServiceModelNode businessServiceModelNode) {
        BusinessQueryNode businessQueryNode = BusinessQueryDslConvert.INSTANCE.dto2Do(queryDsl);
        businessQueryNode.setParentNode(businessServiceModelNode);
        return businessQueryNode;
    }
}
