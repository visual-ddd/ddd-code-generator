package com.wd.paas.generator.newdsl.dsl;

import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.convert.ApplicationConvert;
import com.wd.paas.generator.newdsl.convert.BusinessDomainConvert;
import com.wd.paas.generator.newdsl.convert.BusinessScenarioConvert;
import com.wd.paas.generator.newdsl.visitor.element.Application;
import com.wd.paas.generator.newdsl.visitor.element.BusinessDomain;
import com.wd.paas.generator.newdsl.visitor.element.BusinessScenario;
import lombok.Data;

import java.util.List;

/**
 * 描述一个应用[微服务-限界上下文]的特定语言
 *
 * @author zhuxueliang
 */
@Data
public class ApplicationDsl {

    private Info info;

    private Versionable versionable;

    private String packageName;

    private List<BusinessDomainDsl> businessDomainDTOList;

    private List<BusinessScenarioDsl> businessScenarioDTOList;

    public Application buildApplication() {
        Application application = ApplicationConvert.INSTANCE.dto2Do(this);

        List<BusinessDomain> businessDomains = BusinessDomainConvert.INSTANCE.dtoList2DoList(businessDomainDTOList);
        List<BusinessScenario> businessScenarios = BusinessScenarioConvert.INSTANCE.dtoList2DoList(businessScenarioDTOList);

        businessDomains.forEach(application::add);
        businessScenarios.forEach(application::add);

        return application;
    }
}
