package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.enums.CardinalityEnum;
import lombok.Data;

import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月30日 11:37:59
 * describe 映射目标信息
 */
@Data
public class TargetInfo {

    @SerializedName("target")
    private String target;

    @SerializedName("cardinality")
    private CardinalityEnum cardinalityEnum;

    @SerializedName("mapper")
    private List<MapperInfo> mapperList;

}
