package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author shimmer
 */
@Data
public class DataModelDsl {

    @SerializedName("dataObjects")
    private DataObjectDsl dataObjectDsl;

    @SerializedName("references")
    private DataObjectReferenceDsl dataObjectReferenceDsl;

}
