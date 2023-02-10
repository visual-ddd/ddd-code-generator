package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.dsl.ApplicationDsl;
import com.wd.paas.generator.builder.ApplicationBuilder;
import com.wd.paas.generator.generate.DslParser;
import com.wd.paas.generator.generate.element.ApplicationNode;
import com.wd.paas.generator.generate.visitor.TemplateVisitor;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.input.util.Dsl2JsonUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ASTApplicationDslTest {

    @Test
    public void buildApplication() throws IOException {
        // DSL json 转 dsl
        ApplicationDsl applicationDsl = Dsl2JsonUtil.getDslElement("./src/test/resources/applicationDsl.json", ApplicationDsl.class);
        ApplicationNode app = ApplicationBuilder.build(applicationDsl);

        DslParser dslStruct = new DslParser();
        dslStruct.add(app);

        TemplateVisitor templateVisitor = new TemplateVisitor(new TemplateContext("./target",null));
        dslStruct.run(templateVisitor);

        Assert.assertTrue(true);
    }
}