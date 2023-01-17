package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/***
 * @author wangchensheng
 */
@Data
public class SignatureInfo {

    @SerializedName("description")
    private String description;

    @SerializedName("parameters")
    private List<ParameterInfo> parameterList;

    @SerializedName("return")
    private ReturnInfo returnInfo;
}
