package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * @author shimmer
 */
@Data
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
