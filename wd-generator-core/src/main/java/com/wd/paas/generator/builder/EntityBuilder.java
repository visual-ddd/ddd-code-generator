package com.wd.paas.generator.builder;

import com.wd.paas.dsl.EntityDsl;
import com.wd.paas.generator.builder.convert.EntityDslConvert;
import com.wd.paas.generator.generate.element.AggregateNode;
import com.wd.paas.generator.generate.element.EntityNode;

public class EntityBuilder {
    public static EntityNode build(EntityDsl entityDsl, AggregateNode astAggregate) {
        EntityNode astEntity = EntityDslConvert.INSTANCE.dto2Do(entityDsl);
        astEntity.setParentNode(astAggregate);
        return astEntity;
    }
}