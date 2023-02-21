package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.DataIndexInfo;
import com.wd.paas.common.DataPropertyInfo;
import com.wd.paas.common.Named;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 数据对象模型
 *
 * @author Wangchensheng@wakedata.com
 * @date 2023年01月30日 10:34:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DataObjectDsl extends Named {

    /**
     * 表名
     */
    @SerializedName("tableName")
    private String tableName;

    /**
     * 表字段列表
     */
    @SerializedName("properties")
    private List<DataPropertyInfo> dataPropertyList;

    /**
     * 表名
     */
    @SerializedName("indexes")
    private List<DataIndexInfo> dataIndexInfos;

}
