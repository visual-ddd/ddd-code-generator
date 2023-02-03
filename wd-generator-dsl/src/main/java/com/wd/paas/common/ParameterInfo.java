package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/***
 * 参数信息
 *
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ParameterInfo extends Info {

    /**
     * 类型
     */
    @SerializedName("type")
    private String type;

}
