package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.VersionInfo;
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
public class ApplicationDsl extends VersionInfo {

    /**
     * 项目包名，例如：com.wk.paas
     */
    @SerializedName("package")
    private String packageName;

    /**
     * 业务域DSL列表
     */
    @SerializedName("businessDomains")
    private List<BusinessDomainDsl> businessDomainList;

    /**
     * 业务场景DSL列表
     */
    @SerializedName("businessScenarios")
    private List<BusinessScenarioDsl> businessScenarioList;
}
