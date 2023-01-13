package com.wd.paas.generator.newdsl.common;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author shimmer
 */
@Data
@Builder
public class Info {

    @SerializedName("title")
    private String title;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("meta")
    private List<PropertyInfo> meta;
}
