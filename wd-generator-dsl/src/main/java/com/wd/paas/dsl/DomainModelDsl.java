package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * 领域模型DSL
 * 描述一个业务域下的所有聚合
 *
 * @author shimmer
 */
@Data
public class DomainModelDsl {

    /**
     * 聚合DSL列表
     */
    @SerializedName("aggregates")
    private List<AggregateDsl> aggregateList;

}
