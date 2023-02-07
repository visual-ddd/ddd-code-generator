package com.wd.paas.generator.newdsl.input.dsl;

import com.google.common.reflect.TypeToken;
import com.wd.paas.dsl.*;
import com.wd.paas.generator.builder.ApplicationBuilder;
import com.wd.paas.generator.generate.DslParser;
import com.wd.paas.generator.generate.element.ASTApplication;
import com.wd.paas.generator.generate.visitor.velocitytemplate.JavaTemplateVisitor;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

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

        JavaTemplateVisitor javaTemplateVisitor = new JavaTemplateVisitor(new TemplateContext("./target",null));
        dslStruct.accept(javaTemplateVisitor::preHandle);
        dslStruct.accept(javaTemplateVisitor::generate);

        Assert.assertTrue(true);
    }
}