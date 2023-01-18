package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 查询请求
 *
 * @author shimmer
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QueryDsl extends Info {

    /**
     * 查询的触发来源，默认为 http, rpc 两种类型
     */
    @SerializedName("source")
    private List<SourceInfo> querySourceList;

    /**
     * 查询的参数实体
     */
    @SerializedName("properties")
    private List<PropertyInfo> propertyList;

    /**
     * 分页返回
     */
    @SerializedName("pagination")
    private Boolean pagination;

    /**
     * 执行器, 默认为 ·查询名称 + Exe· 连接起来的类， 有固定的实现逻辑
     */
    @SerializedName("handler")
    private ClassInfo handler;

    /**
     * 规则
     */
    @SerializedName("rules")
    private List<RuleInfo> ruleList;

    /**
     * 查询返回值
     */
    @SerializedName("return")
    private ReturnInfo returnInfo;
}
