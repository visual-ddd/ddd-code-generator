package com.wd.paas.generator.newdsl.input.dsl;

import com.google.common.reflect.TypeToken;
import com.wd.paas.dsl.ApplicationDsl;
import com.wd.paas.dsl.BusinessDomainDsl;
import com.wd.paas.dsl.QueryModelDsl;
import com.wd.paas.generator.builder.ApplicationBuilder;
import com.wd.paas.generator.generate.ElementParser;
import com.wd.paas.generator.generate.visitor.TemplateVisitor;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ASTQueryModelDslTest {

    @Test
    public void buildApplication() throws IOException {
        // DSL json 转 dsl
        ApplicationDsl applicationDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/applicationDsl.json", ApplicationDsl.class);
        List<BusinessDomainDsl> businessDomainDslList = Dsl2JsonUtil.getDslElement("./src/test/resources/businessDomainDsl.json", new TypeToken<List<BusinessDomainDsl>>(){}.getType());
        QueryModelDsl queryModelDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/queryObjectDsl.json", QueryModelDsl.class);

        businessDomainDslList.get(0).setQueryModel(queryModelDsl);
        applicationDsl.setBusinessDomainList(businessDomainDslList);

        ElementParser dslStruct = new ElementParser();
        dslStruct.add(ApplicationBuilder.build(applicationDsl));

        TemplateVisitor templateVisitor = new TemplateVisitor(new TemplateContext("./target"));
        dslStruct.accept(templateVisitor::preHandle);
        dslStruct.accept(templateVisitor::generate);

        Assert.assertTrue(true);
    }
}