package com.wd.paas.generator.newdsl.input.dsl;

import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.generate.visitor.element.Application;
import com.wd.paas.generator.newdsl.generate.visitor.objectstruct.DslStruct;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.JavaTemplateVisitor;
import com.wd.paas.generator.newdsl.generate.visitor.visitor.velocitytemplate.TemplateContext;
import com.wd.paas.generator.newdsl.util.GsonUtil;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class ApplicationDslTest {

    @Test
    public void buildApplication() throws IOException {
        // DSL json 转 dsl
        String json = IOUtils.toString(Files.newInputStream(Paths.get("./src/test/resources/applicationDsl.json")), StandardCharsets.UTF_8);
        ApplicationDsl applicationDsl = GsonUtil.fromJson(json, ApplicationDsl.class);
        System.out.println(GsonUtil.toJson(applicationDsl));

        Application app = applicationDsl.buildApplication();

        DslStruct dslStruct = new DslStruct();
        dslStruct.add(app);
        JavaTemplateVisitor javaTemplateVisitor = new JavaTemplateVisitor(new TemplateContext("./target",null));
        dslStruct.accept(javaTemplateVisitor);

        Assert.assertTrue(true);
    }

    private static ApplicationDsl getApplicationDTO(String appName) {
        ApplicationDsl applicationDTO = new ApplicationDsl();
        applicationDTO.setInfo(Info.builder().name(appName).build());

        applicationDTO.setBusinessDomainList(Collections.singletonList(
                new BusinessDomainDsl(Info.builder().name((appName + "业务域")).build(), null, null)));

        applicationDTO.setBusinessScenarioList(Collections.singletonList(
                new BusinessScenarioDsl(Info.builder().name((appName + "业务场景")).build(), new Versionable())));
        return applicationDTO;
    }
}