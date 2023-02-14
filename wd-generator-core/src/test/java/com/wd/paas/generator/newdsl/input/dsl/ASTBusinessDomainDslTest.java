package com.wd.paas.generator.newdsl.input.dsl;

import com.google.common.reflect.TypeToken;
import com.wd.paas.dsl.*;
import com.wd.paas.generator.builder.ApplicationBuilder;
import com.wd.paas.generator.generate.ElementParser;
import com.wd.paas.generator.generate.element.ApplicationNode;
import com.wd.paas.generator.generate.visitor.TemplateVisitor;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ASTBusinessDomainDslTest {

    @Test
    public void buildApplication() throws IOException {
        // DSL json 转 dsl
        ApplicationDsl applicationDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/applicationDsl.json", ApplicationDsl.class);

        List<BusinessDomainDsl> businessDomainDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/businessDomainDsl.json", new TypeToken<List<BusinessDomainDsl>>(){}.getType());

        QueryModelDsl queryModelDsl = Dsl2JsonUtil
                .getDslElement("./src/test/resources/queryObjectDsl.json", QueryModelDsl.class);
        businessDomainDslList.get(0).setQueryModel(queryModelDsl);

        List<AggregateDsl> aggregateDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/aggregationDsl.json", new TypeToken<List<AggregateDsl>>(){}.getType());

        List<CommandDsl> commandDslList = Dsl2JsonUtil
                .getDslElement("./src/test/resources/commandDsl.json", new TypeToken<List<CommandDsl>>(){}.getType());
        aggregateDslList.get(0).setCommandList(commandDslList);

        businessDomainDslList.get(0).getDomainModel().setAggregateList(aggregateDslList);
        applicationDsl.setBusinessDomainList(businessDomainDslList);

        ElementParser dslStruct = new ElementParser();
        ApplicationNode app = ApplicationBuilder.build(applicationDsl);
        dslStruct.add(app);

        TemplateVisitor templateVisitor = new TemplateVisitor(new TemplateContext("./target"));
        dslStruct.accept(templateVisitor::preHandle);
        dslStruct.accept(templateVisitor::generate);

        Assert.assertTrue(true);
    }
}