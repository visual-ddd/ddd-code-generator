package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.Versionable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 描述一个完整业务提供的原子能力，以及实现细节
 *
 * @author shimmer
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessDomainDsl extends Versionable {

    @SerializedName("domainModel")
    private DomainModelDsl domainModel;

    @SerializedName("dataModel")
    private DataModelDsl dataModel;

    @SerializedName("queryModel")
    private QueryModelDsl queryModel;

    @SerializedName("objectMapper")
    private ObjectMapperModelDsl objectMapperModel;

    @SerializedName("vision")
    private String vision;

    @SerializedName("document")
    private String document;
}
