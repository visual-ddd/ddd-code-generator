package com.wd.paas.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.common.MapperInfo;
import lombok.Data;

import java.util.List;

@Data
public class ConvertDsl {

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("source")
    private String source;

    @SerializedName("target")
    private String target;

    @SerializedName("mapper")
    private List<MapperInfo> mapperList;

}
