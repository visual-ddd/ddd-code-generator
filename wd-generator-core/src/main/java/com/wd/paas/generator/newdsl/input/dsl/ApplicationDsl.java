package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.input.dsl.convert.ApplicationDslConvert;
import com.wd.paas.generator.newdsl.input.dsl.convert.BusinessDomainDslConvert;
import com.wd.paas.generator.newdsl.input.dsl.convert.BusinessScenarioDslConvert;
import com.wd.paas.generator.newdsl.generate.visitor.element.Application;
import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessDomain;
import com.wd.paas.generator.newdsl.generate.visitor.element.BusinessScenario;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 描述一个应用[微服务-限界上下文]的特定语言
 *
 * @author zhuxueliang
 */
@Data
public class ApplicationDsl {

    @SerializedName("info")
    private Info info;

    @SerializedName("versionable")
    private Versionable versionable;

    @SerializedName("package")
    private String packageName;

    @SerializedName("businessDomains")
    private List<BusinessDomainDsl> businessDomainList;

    @SerializedName("businessScenarios")
    private List<BusinessScenarioDsl> businessScenarioList;


    public Application buildApplication() {
        Application application = ApplicationDslConvert.INSTANCE.dto2Do(this);

//        List<BusinessDomain> businessDomains = BusinessDomainDslConvert.INSTANCE.dtoList2DoList(businessDomainList);
//        List<BusinessScenario> businessScenarios = BusinessScenarioDslConvert.INSTANCE.dtoList2DoList(businessScenarioList);
//
//        businessDomains.forEach(application::add);
//        businessScenarios.forEach(application::add);

        return application;
    }
}
