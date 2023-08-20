package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 更新验证码
 */
@Data
@ApiModel(description = "更新验证码")
public class AccountVerificationUpdateDTO {

    @NotNull(message = "主键不能为空！")
    @ApiModelProperty(value = "主键" , required = true)
    private Long id;

    @NotNull(message = "验证码不能为空！")
    @ApiModelProperty(value = "验证码" , required = true)
    private String code;

}