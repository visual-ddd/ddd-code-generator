package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.Named;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 数据模型DSL
 *
 * @author shimmer
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DataModelDsl extends Named {

    /**
     * 数据对象DSL列表
     */
    @SerializedName("dataObjects")
    private List<DataObjectDsl> dataObjectList;

    /**
     * 引用关系列表
     */
    @SerializedName("references")
    private List<DataObjectReferenceDsl> dataObjectReferenceList;

}
