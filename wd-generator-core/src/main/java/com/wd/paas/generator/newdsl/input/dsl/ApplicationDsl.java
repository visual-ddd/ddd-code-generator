package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.generate.visitor.element.Application;
import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import com.wd.paas.generator.newdsl.input.dsl.convert.ApplicationDslConvert;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述一个应用[微服务-限界上下文]的特定语言
 *
 * @author zhuxueliang
 */
@Data
public class ApplicationDsl implements ElementBuildable {

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

    @Override
    public Application build() {
        Application application = ApplicationDslConvert.INSTANCE.dto2Do(this);
        List<Element> elements = new ArrayList<>();
        businessDomainList.stream().map(BusinessDomainDsl::build).forEach(elements::add);
        businessScenarioList.stream().map(BusinessScenarioDsl::build).forEach(elements::add);
        application.addAll(elements);
        return application;
    }
}
