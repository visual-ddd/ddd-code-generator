package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class MapperInfo {

    @SerializedName("sourceField")
    private String sourceField;

    @SerializedName("targetField")
    private String targetField;
}
