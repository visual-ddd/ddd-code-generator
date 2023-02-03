package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.VersionInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 业务域DSL
 * 描述一个完整业务提供的原子能力，以及实现细节
 *
 * @author shimmer
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessDomainDsl extends VersionInfo {

    /**
     * 领域模型DSL
     */
    @SerializedName("domainModel")
    private DomainModelDsl domainModel;

    /**
     * 数据模型DSL
     */
    @SerializedName("dataModel")
    private DataModelDsl dataModel;

    /**
     * 查询模型DSL
     */
    @SerializedName("queryModel")
    private QueryModelDsl queryModel;

    /**
     * 对象关系映射模型DSL
     */
    @SerializedName("objectMapper")
    private ObjectMapperModelDsl objectMapperModel;

    /**
     * 产品愿景资源链接
     */
    @SerializedName("vision")
    private String vision;

    /**
     * 备注
     */
    @SerializedName("document")
    private String document;
}
