package com.wd.paas.generator.builder;

import com.wd.paas.dsl.EntityDsl;
import com.wd.paas.generator.builder.convert.EntityDslConvert;
import com.wd.paas.generator.generate.element.ASTEntity;

public class EntityBuilder {
    public static ASTEntity build(EntityDsl entityDsl) {
        entityDsl.getPropertyList().forEach(propertyInfo -> propertyInfo.setAccess("private" ));
        return EntityDslConvert.INSTANCE.dto2Do(entityDsl);
    }
}