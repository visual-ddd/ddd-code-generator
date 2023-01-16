package com.wd.paas.generator.newdsl.input.dsl;

import com.google.common.reflect.TypeToken;
import com.wd.paas.generator.newdsl.generate.visitor.objectstruct.DslStruct;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.JavaTemplateVisitor;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class CommandDslTest {

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

        DslStruct dslStruct = new DslStruct();
        dslStruct.add(applicationDsl.build());

        JavaTemplateVisitor javaTemplateVisitor = new JavaTemplateVisitor(new TemplateContext("./",null));
        dslStruct.accept(javaTemplateVisitor);

        Assert.assertTrue(true);
    }
}