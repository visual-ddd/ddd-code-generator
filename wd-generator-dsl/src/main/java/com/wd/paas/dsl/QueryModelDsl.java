package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * 查询模型DSL
 *
 * @author shimmer
 */
@Data
public class QueryModelDsl {

    /**
     * 查询对象DSL列表
     */
    @SerializedName("queries")
    private List<QueryDsl> queryDslList;

    /**
     * 结果集DSL列表
     */
    @SerializedName("dtos")
    private List<DtoDsl> dtoDslList;
}
