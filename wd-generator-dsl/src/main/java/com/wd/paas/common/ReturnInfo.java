package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/***
 * 返回值信息
 *
 * @author wangchensheng
 */
@Data
public class ReturnInfo {

    /**
     * 类型
     */
    @SerializedName("type")
    private String type;
}
