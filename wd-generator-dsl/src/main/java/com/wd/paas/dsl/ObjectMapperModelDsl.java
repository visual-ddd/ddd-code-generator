package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author shimmer
 */
@Data
public class ObjectMapperModelDsl {

    @SerializedName("source")
    private String source;

    @SerializedName("mappers")
    private List<ObjectFieldMapperDsl> convertList;

    @SerializedName("target")
    private String target;

}
