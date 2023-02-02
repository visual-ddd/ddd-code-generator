package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author shimmer
 */
@Data
public class ObjectMapperModelDsl {

    @SerializedName("mappers")
    private List<ObjectMapperDsl> objectMapperDsl;

}
