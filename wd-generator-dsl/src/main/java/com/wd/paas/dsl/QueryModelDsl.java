package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * 查询模型
 *
 * @author shimmer
 */
@Data
public class QueryModelDsl {

    @SerializedName("queries")
    private List<QueryDsl> queryDslList;

    @SerializedName("dtos")
    private List<DtoDsl> dtoDslList;
}
