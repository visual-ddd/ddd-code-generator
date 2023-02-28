package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.ObjectTableReference;
import lombok.Data;

import java.util.List;

/**
 * 数据对象与表映射关系模型
 *
 * @author Wangchensheng@wakedata.com
 * @date 2023年01月30日 10:34:22
 */
@Data
public class DataObjectReferenceDsl {

    /**
     * NameOf<DataObject>, DataObject 标识符
     */
    @SerializedName("source")
    private String source;

    /**
     * idOf<DataObject>, DataObject id
     */
    @SerializedName("sourceId")
    private String sourceId;

    /**
     * 目标表映射关系列表
     */
    @SerializedName("targets")
    private List<ObjectTableReference> targets;

}
