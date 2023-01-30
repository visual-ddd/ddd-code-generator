package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.TargetInfo;
import lombok.Data;

import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月30日 10:34:22
 * describe 数据对象映射关系模型
 */
@Data
public class DataObjectReferenceDsl {

    @SerializedName("source")
    private String source;

    @SerializedName("dataObjects")
    private List<TargetInfo> targets;

}
