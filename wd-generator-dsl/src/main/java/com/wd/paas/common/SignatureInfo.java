package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/***
 * 方法签名
 *
 * @author wangchensheng
 */
@Data
public class SignatureInfo {

    /**
     * 描述
     */
    @SerializedName("description")
    private String description;

    /**
     * 参数列表
     */
    @SerializedName("parameters")
    private List<ParameterInfo> parameterList;

    /**
     * 返回值
     */
    @SerializedName("return")
    private ReturnInfo returnInfo;
}
