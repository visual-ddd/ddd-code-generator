package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.Info;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author shimmer
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DataModelDsl extends Info {

    @SerializedName("dataObjects")
    private List<DataObjectDsl> dataObjectList;

    @SerializedName("references")
    private List<DataObjectReferenceDsl> dataObjectReferenceList;

}
