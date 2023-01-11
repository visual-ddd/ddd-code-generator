package com.wd.paas.generator.newdsl.input.dsl;

import com.google.gson.annotations.SerializedName;
import com.wd.paas.generator.newdsl.common.Info;
import com.wd.paas.generator.newdsl.common.Versionable;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shimmer
 */
@AllArgsConstructor
@Data
public class BusinessScenarioDsl {

    @SerializedName("info")
    private Info info;

    @SerializedName("versionable")
    private Versionable versionable;
}