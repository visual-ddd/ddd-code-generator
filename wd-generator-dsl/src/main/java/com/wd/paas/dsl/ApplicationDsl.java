package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.Versionable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 描述一个应用[微服务-限界上下文]的特定语言
 *
 * @author zhuxueliang
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ApplicationDsl extends Versionable {

    @SerializedName("package")
    private String packageName;

    @SerializedName("businessDomains")
    private List<BusinessDomainDsl> businessDomainList;

    @SerializedName("businessScenarios")
    private List<BusinessScenarioDsl> businessScenarioList;
}
