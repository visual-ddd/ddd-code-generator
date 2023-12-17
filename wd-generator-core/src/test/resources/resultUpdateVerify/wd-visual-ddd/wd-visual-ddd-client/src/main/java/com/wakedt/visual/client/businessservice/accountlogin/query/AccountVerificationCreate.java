package com.wakedt.visual.client.businessservice.accountlogin.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 发送注册账号验证码
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "发送注册账号验证码")
public class AccountVerificationCreate {

    @NotNull(message = "账号唯一标识（邮箱）不能为空！")
    @ApiModelProperty(value = "账号唯一标识（邮箱）" , required = true)
    private String accountNo;

    @NotNull(message = "验证码不能为空！")
    @ApiModelProperty(value = "验证码" , required = true)
    private String code;

}