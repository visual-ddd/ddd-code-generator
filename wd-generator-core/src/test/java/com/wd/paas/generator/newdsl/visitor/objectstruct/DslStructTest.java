package com.wd.paas.generator.newdsl.visitor.objectstruct;

import com.wd.paas.generator.generate.element.Application;
import com.wd.paas.generator.generate.DslParser;
import com.wd.paas.generator.generate.visitor.velocitytemplate.JavaTemplateVisitor;
import com.wd.paas.generator.generate.visitor.velocitytemplate.TemplateContext;
import org.junit.Assert;
import org.junit.Test;

public class DslStructTest {

    @Test
    public void accept() {
        Application application = getApplication("app1");

        DslParser dslStruct = new DslParser();
        dslStruct.add(application);

        JavaTemplateVisitor javaTemplateVisitor = new JavaTemplateVisitor(new TemplateContext("./",null));
        dslStruct.accept(javaTemplateVisitor);

        Assert.assertTrue(true);
    }

    private static Application getApplication(String appName) {
        Application application = new Application();
//        application.setInfo(Info.builder().name(appName).build());

//        application.add(new BusinessDomain(Info.builder().name((appName + "业务域")).build(), new Versionable()));
//        applicationDTO.add(new BusinessScenario(Info.builder().name((appName + "业务场景")).build(), new Versionable()));
        return application;
    }
}