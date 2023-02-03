package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/***
 * 枚举信息
 *
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EnumMemberInfo extends Info {

    /**
     * 成员值 number | string
     */
    @SerializedName("code")
    private Integer code;

}
