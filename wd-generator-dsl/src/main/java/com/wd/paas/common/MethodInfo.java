package com.wd.paas.common;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/***
 * 方法信息
 *
 * @author wangchensheng
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MethodInfo extends Info {

    /**
     * 方法签名
     */
    @SerializedName("signature")
    private SignatureInfo signature;

    /**
     * 访问控制, 默认是 public
     */
    @SerializedName("access")
    private String access;

    /**
     * 是否是抽象方法，默认是 false
     */
    @SerializedName("isAbstract")
    private Boolean isAbstract;

}
