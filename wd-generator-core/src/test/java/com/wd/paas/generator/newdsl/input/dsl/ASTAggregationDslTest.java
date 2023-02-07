package com.wd.paas.generator.newdsl.input.dsl;

import com.google.common.reflect.TypeToken;
import com.wd.paas.dsl.AggregateDsl;
import com.wd.paas.dsl.ApplicationDsl;
import com.wd.paas.dsl.BusinessDomainDsl;
import com.wd.paas.generator.builder.ApplicationBuilder;
import com.wd.paas.generator.generate.DslParser;
import com.wd.paas.generator.generate.visitor.JavaTemplateVisitor;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ASTAggregationDslTest {

    @Test
    public void buildApplication() throws IOException {
        // DSL json 转 dsl
        ApplicationDsl applicationDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/applicationDsl.json", ApplicationDsl.class);
        List<BusinessDomainDsl> businessDomainDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/businessDomainDsl.json", new TypeToken<List<BusinessDomainDsl>>(){}.getType());
        List<AggregateDsl> aggregateDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/aggregationDsl.json", new TypeToken<List<AggregateDsl>>(){}.getType());

        businessDomainDslList.get(0).getDomainModel().setAggregateList(aggregateDslList);
        applicationDsl.setBusinessDomainList(businessDomainDslList);

        DslParser dslStruct = new DslParser();
        dslStruct.add(ApplicationBuilder.build(applicationDsl));

        TemplateContext context = new TemplateContext("./target", null);
        JavaTemplateVisitor javaTemplateVisitor = new JavaTemplateVisitor(context);
        dslStruct.run(javaTemplateVisitor);

        Assert.assertTrue(true);
    }

}