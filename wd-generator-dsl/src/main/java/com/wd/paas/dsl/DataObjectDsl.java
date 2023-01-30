package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.DataPropertyInfo;
import lombok.Data;

import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月30日 10:34:12
 * describe 数据对象模型
 */
@Data
public class DataObjectDsl {

    @SerializedName("tableName")
    private String tableName;

    @SerializedName("properties")
    private List<DataPropertyInfo> typeList;

    @SerializedName("indexes")
    private DataIndexDsl dataIndexDsl;

}
