package com.wd.paas.generator.newdsl.dto;

import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.dsl.ApplicationDsl;
import com.wd.paas.generator.newdsl.dsl.BusinessDomainDsl;
import com.wd.paas.generator.newdsl.dsl.BusinessScenarioDsl;
import com.wd.paas.generator.newdsl.visitor.element.Application;
import com.wd.paas.generator.newdsl.visitor.objectstruct.DslStruct;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class ApplicationDTOTest {

    @Test
    public void buildApplication() {
        // DSL json 转 dto

        ApplicationDsl applicationDsl = getApplicationDTO("app1");
        Application app = applicationDsl.buildApplication();

        DslStruct dslStruct = new DslStruct();
        dslStruct.add(app);

        Assert.assertTrue(true);
    }

    private static ApplicationDsl getApplicationDTO(String appName) {
        ApplicationDsl applicationDTO = new ApplicationDsl();
        applicationDTO.setInfo(Info.builder().name(appName).build());

        applicationDTO.setBusinessDomainDTOList(Collections.singletonList(
                new BusinessDomainDsl(Info.builder().name((appName + "业务域")).build(), null, null)));

        applicationDTO.setBusinessScenarioDTOList(Collections.singletonList(
                new BusinessScenarioDsl(Info.builder().name((appName + "业务场景")).build(), new Versionable())));
        return applicationDTO;
    }
}