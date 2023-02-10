package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.dsl.ApplicationDsl;
import com.wd.paas.dsl.BusinessDomainDsl;
import com.wd.paas.generator.builder.ApplicationBuilder;
import com.wd.paas.generator.generate.DslParser;
import com.wd.paas.generator.generate.element.ASTApplication;
import com.wd.paas.generator.generate.visitor.TemplateVisitor;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class ASTAllDslTest {

    @Test
    public void buildApplication() throws IOException {
        // DSL json 转 dsl
        ApplicationDsl applicationDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/applicationDsl.json", ApplicationDsl.class);

        BusinessDomainDsl businessDomainDsl = Dsl2JsonUtil
                .getDslElement("./src/test/resources/AllDsl.json", BusinessDomainDsl.class);

        applicationDsl.setBusinessDomainList(Collections.singletonList(businessDomainDsl));

        DslParser dslStruct = new DslParser();
        ASTApplication app = ApplicationBuilder.build(applicationDsl);
        dslStruct.add(app);

        TemplateVisitor templateVisitor = new TemplateVisitor(new TemplateContext("./target",null));
        dslStruct.accept(templateVisitor::preHandle);
        dslStruct.accept(templateVisitor::generate);

        Assert.assertTrue(true);
    }
}