package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.enums.CardinalityEnum;
import lombok.Data;

import java.util.List;

/**
 * 映射目标表信息
 *
 * @author Wangchensheng@wakedata.com
 * @date 2023年01月30日 11:37:59
 */
@Data
public class ObjectTableReference {

    /**
     * 目标表
     */
    @SerializedName("target")
    private String target;

    /**
     * 目标表ID
     */
    @SerializedName("targetId")
    private String targetId;

    /**
     * 关联关系
     */
    @SerializedName("cardinality")
    private CardinalityEnum cardinalityEnum;

    /**
     * 字段映射
     */
    @SerializedName("mapper")
    private List<ObjectFieldMapper> mapperList;

}
