package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author shimmer
 */
@Data
public class DataModelDsl {

    @SerializedName("eRModel")
    private ERModelDsl eRModel;

}
