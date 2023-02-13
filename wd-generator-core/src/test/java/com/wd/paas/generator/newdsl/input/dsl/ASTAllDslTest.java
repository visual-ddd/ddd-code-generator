package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.dsl.ApplicationDsl;
import com.wd.paas.dsl.BusinessDomainDsl;
import com.wd.paas.generator.CodeGenerateService;
import com.wd.paas.generator.builder.ApplicationBuilder;
import com.wd.paas.generator.generate.element.ApplicationNode;
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

        ApplicationNode applicationNode = ApplicationBuilder.build(applicationDsl);
        TemplateVisitor templateVisitor = new TemplateVisitor(new TemplateContext("./target",null));
        CodeGenerateService codeGenerateService = new CodeGenerateService(applicationNode);
        codeGenerateService.run(templateVisitor);

        Assert.assertTrue(true);
    }
}