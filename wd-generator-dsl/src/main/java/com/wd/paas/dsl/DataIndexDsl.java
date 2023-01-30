package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.enums.IndexMethodEnum;
import com.wd.paas.common.enums.IndexTypeEnum;
import lombok.Data;

import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月30日 11:09:56
 * describe 数据索引
 */
@Data
public class DataIndexDsl {

    /**
     * 默认Normal
     */
    @SerializedName("type")
    private IndexTypeEnum indexTypeEnum;

    /**
     * 索引栏位 通常以数据对象的属性名称存放
     */
    @SerializedName("properties")
    private List<String> properties;

    /**
     * 默认为Bree
     */
    @SerializedName("method")
    private IndexMethodEnum indexMethodEnum;


}
