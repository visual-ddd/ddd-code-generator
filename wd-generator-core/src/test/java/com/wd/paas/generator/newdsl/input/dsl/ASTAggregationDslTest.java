package com.wd.paas.generator.newdsl.input.dsl;

import com.google.common.reflect.TypeToken;
import com.wd.paas.dsl.AggregateDsl;
import com.wd.paas.dsl.ApplicationDsl;
import com.wd.paas.dsl.BusinessDomainDsl;
import com.wd.paas.generator.CodeGenerateService;
import com.wd.paas.generator.builder.ApplicationBuilder;
import com.wd.paas.generator.generate.visitor.TemplateVisitor;
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

        TemplateVisitor templateVisitor = new TemplateVisitor(new TemplateContext("./target"));
        CodeGenerateService codeGenerateService = new CodeGenerateService(ApplicationBuilder.build(applicationDsl));
        codeGenerateService.run(templateVisitor);

        Assert.assertTrue(true);
    }

}