package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.Versionable;
import com.wd.paas.generator.newdsl.generate.visitor.element.Application;
import com.wd.paas.generator.newdsl.generate.visitor.element.Element;
import com.wd.paas.generator.newdsl.input.dsl.convert.ApplicationDslConvert;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 描述一个应用[微服务-限界上下文]的特定语言
 *
 * @author zhuxueliang
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ApplicationDsl extends Versionable implements ElementBuildable {

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
        Optional.ofNullable(businessDomainList).ifPresent(e -> e.stream().map(ElementBuildable::build).forEach(elements::add));
        Optional.ofNullable(businessScenarioList).ifPresent(e -> e.stream().map(ElementBuildable::build).forEach(elements::add));
        application.addAll(elements);
        return application;
    }
}
