package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.VersionInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 业务场景DSL
 *
 * @author shimmer
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
public class BusinessScenarioDsl extends VersionInfo {

    /**
     * 依赖的业务域服务
     */
    @SerializedName("domainDependencies")
    private List<DomainDependencyDsl> domainDependencies;

    /**
     * 业务场景服务，直接复用查询模型
     */
    @SerializedName("serviceModel")
    private QueryModelDsl serviceModel;

}