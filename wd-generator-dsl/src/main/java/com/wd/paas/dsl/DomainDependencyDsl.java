package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 依赖的业务域服务DSL
 *
 * @author shimmer
 */
@AllArgsConstructor
@Data
public class DomainDependencyDsl {

    /**
     * 团队 Id, 跨团队关联时需要
     */
    @SerializedName("teamId")
    private String teamId;

    /**
     * 依赖业务域 ID
     */
    @SerializedName("domainId")
    private String domainId;

    /**
     * 业务域版本号 ID
     */
    @SerializedName("versionId")
    private String versionId;

    /**
     * 服务id,
     * 查询或者指令的 uuid
     */
    @SerializedName("serviceId")
    private String serviceId;
}
