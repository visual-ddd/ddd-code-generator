package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.generate.visitor.objectstruct.DslStruct;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.JavaTemplateVisitor;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class CommandDslTest {

    @Test
    public void buildApplication() throws IOException {
        // DSL json 转 dsl
        ApplicationDsl applicationDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/applicationDsl.json", ApplicationDsl.class);
        BusinessDomainDsl businessDomainDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/businessDomainDsl.json", BusinessDomainDsl.class);
        AggregateDsl aggregateDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/aggregationDsl.json", AggregateDsl.class);
        CommandDsl commandDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/commandDsl.json", CommandDsl.class);

        aggregateDsl.setCommandList(Collections.singletonList(commandDsl));
        businessDomainDsl.getDomainModel().setAggregateList(Collections.singletonList(aggregateDsl));
        applicationDsl.setBusinessDomainList(Collections.singletonList(businessDomainDsl));

        DslStruct dslStruct = new DslStruct();
        dslStruct.add(applicationDsl.build());

        JavaTemplateVisitor javaTemplateVisitor = new JavaTemplateVisitor(new TemplateContext("./",null));
        dslStruct.accept(javaTemplateVisitor);

        Assert.assertTrue(true);
    }
}