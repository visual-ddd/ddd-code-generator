package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.generate.visitor.element.Aggregate;
import com.wd.paas.generator.newdsl.generate.visitor.objectstruct.DslStruct;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.JavaTemplateVisitor;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AggregationDslTest {

    @Test
    public void buildApplication() throws IOException {
        // DSL json 转 dsl
        AggregateDsl aggregateDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/aggregationDsl.json", AggregateDsl.class);
        Aggregate aggregate = aggregateDsl.build();

        DslStruct dslStruct = new DslStruct();
        dslStruct.add(aggregate);

        JavaTemplateVisitor javaTemplateVisitor = new JavaTemplateVisitor(new TemplateContext("./target",null));
        dslStruct.accept(javaTemplateVisitor);

        Assert.assertTrue(true);
    }
}