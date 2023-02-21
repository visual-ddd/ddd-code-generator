package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 版本信息
 *
 * @author shimmer
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class VersionInfo extends Named {

    /**
     * 版本号
     */
    @SerializedName("version")
    private String version;

}
