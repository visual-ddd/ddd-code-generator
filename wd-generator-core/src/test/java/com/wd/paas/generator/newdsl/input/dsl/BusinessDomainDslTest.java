package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessDomain;
import com.wd.paas.generator.newdsl.generate.visitor.objectstruct.DslStruct;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.JavaTemplateVisitor;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class BusinessDomainDslTest {

    @Test
    public void buildApplication() throws IOException {
        // DSL json 转 dsl
        BusinessDomainDsl businessDomainDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/businessDomainDsl.json", BusinessDomainDsl.class);
        BusinessDomain businessDomain = businessDomainDsl.build();

        DslStruct dslStruct = new DslStruct();
        dslStruct.add(businessDomain);

        JavaTemplateVisitor javaTemplateVisitor = new JavaTemplateVisitor(new TemplateContext("./target",null));
        dslStruct.accept(javaTemplateVisitor);

        Assert.assertTrue(true);
    }
}