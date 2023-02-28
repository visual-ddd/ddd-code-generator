package com.wd.paas.generator.builder;

import com.wd.paas.dsl.EntityDsl;
import com.wd.paas.generator.builder.convert.AggregateRootDslConvert;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.AggregateRootNode;

public class AggregateRootBuilder {

    public static AggregateRootNode build(EntityDsl aggregateRootDsl, AggregateNode aggregateNode) {
        AggregateRootNode aggregateRootNode = AggregateRootDslConvert.INSTANCE.dto2Do(aggregateRootDsl);
        aggregateRootNode.setParentNode(aggregateNode);
        return aggregateRootNode;
    }
}