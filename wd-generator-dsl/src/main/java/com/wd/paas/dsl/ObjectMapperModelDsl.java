package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * 对象关系映射模型DSL
 *
 * @author shimmer
 */
@Data
public class ObjectMapperModelDsl {

    /**
     * 对象关系映射DSL列表
     */
    @SerializedName("mappers")
    private List<ObjectMapperDsl> objectMapperDsl;

}
