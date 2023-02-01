package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.DataIndexInfo;
import com.wd.paas.common.DataPropertyInfo;
import com.wd.paas.common.Info;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * author Wangchensheng@wakedata.com
 * date 2023年01月30日 10:34:12
 * describe 数据对象模型
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DataObjectDsl extends Info {

    @SerializedName("tableName")
    private String tableName;

    @SerializedName("properties")
    private List<DataPropertyInfo> dataPropertyList;

    @SerializedName("indexes")
    private DataIndexInfo dataIndexInfo;

}
