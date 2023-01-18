package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author shimmer
 */
@Data
public class Info {

    @SerializedName("uuid")
    private String identity;

    @SerializedName("title")
    private String title;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("meta")
    private MetaInfo meta;
}
