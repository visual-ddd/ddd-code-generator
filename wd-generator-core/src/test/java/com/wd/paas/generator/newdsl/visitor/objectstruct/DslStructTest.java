package com.wd.paas.generator.newdsl.visitor.objectstruct;

import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.generate.visitor.element.Application;
import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessDomain;
import com.wd.paas.generator.newdsl.generate.visitor.objectstruct.DslStruct;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.JavaTemplateVisitor;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.TemplateContext;
import org.junit.Assert;
import org.junit.Test;

public class DslStructTest {

    @Test
    public void accept() {
        Application application = getApplication("app1");

        DslStruct dslStruct = new DslStruct();
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