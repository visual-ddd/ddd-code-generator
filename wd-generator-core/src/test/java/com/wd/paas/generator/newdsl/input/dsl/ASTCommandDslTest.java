package com.wd.paas.generator.newdsl.input.dsl;

import com.google.common.reflect.TypeToken;
import com.wd.paas.dsl.AggregateDsl;
import com.wd.paas.dsl.ApplicationDsl;
import com.wd.paas.dsl.BusinessDomainDsl;
import com.wd.paas.dsl.CommandDsl;
import com.wd.paas.generator.builder.ApplicationBuilder;
import com.wd.paas.generator.generate.DslParser;
import com.wd.paas.generator.generate.visitor.velocitytemplate.JavaTemplateVisitor;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ASTCommandDslTest {

    @Test
    public void buildApplication() throws IOException {
        // DSL json 转 dsl
        ApplicationDsl applicationDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/applicationDsl.json", ApplicationDsl.class);
        List<BusinessDomainDsl> businessDomainDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/businessDomainDsl.json", new TypeToken<List<BusinessDomainDsl>>(){}.getType());
        List<AggregateDsl> aggregateDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/aggregationDsl.json", new TypeToken<List<AggregateDsl>>(){}.getType());
        List<CommandDsl> commandDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/commandDsl.json", new TypeToken<List<CommandDsl>>(){}.getType());

        aggregateDslList.get(0).setCommandList(commandDslList);
        businessDomainDslList.get(0).getDomainModel().setAggregateList(aggregateDslList);
        applicationDsl.setBusinessDomainList(businessDomainDslList);

        DslParser dslStruct = new DslParser();
        dslStruct.add(ApplicationBuilder.build(applicationDsl));

        JavaTemplateVisitor javaTemplateVisitor = new JavaTemplateVisitor(new TemplateContext("./target",null));
        dslStruct.accept(javaTemplateVisitor::preHandle);
        dslStruct.accept(javaTemplateVisitor::generate);

        Assert.assertTrue(true);
    }
}