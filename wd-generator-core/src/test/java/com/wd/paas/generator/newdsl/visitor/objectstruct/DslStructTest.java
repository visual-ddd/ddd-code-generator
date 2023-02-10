package com.wd.paas.generator.newdsl.visitor.objectstruct;

import com.wd.paas.generator.generate.DslParser;
import com.wd.paas.generator.generate.element.ASTApplication;
import com.wd.paas.generator.generate.visitor.TemplateVisitor;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import org.junit.Assert;
import org.junit.Test;

public class DslStructTest {

    @Test
    public void accept() {
        ASTApplication ASTApplication = getApplication("app1");

        DslParser dslStruct = new DslParser();
        dslStruct.add(ASTApplication);

        TemplateVisitor templateVisitor = new TemplateVisitor(new TemplateContext("./",null));
        dslStruct.accept(templateVisitor::preHandle);
        dslStruct.accept(templateVisitor::generate);

        Assert.assertTrue(true);
    }

    private static ASTApplication getApplication(String appName) {
        ASTApplication ASTApplication = new ASTApplication();
//        application.setInfo(Info.builder().name(appName).build());

//        application.add(new BusinessDomain(Info.builder().name((appName + "业务域")).build(), new Versionable()));
//        applicationDTO.add(new BusinessScenario(Info.builder().name((appName + "业务场景")).build(), new Versionable()));
        return ASTApplication;
    }
}