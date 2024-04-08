package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 修改用户密码
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "修改用户密码")
public class AccountPasswordUpdateDTO {

    @NotNull(message = "主键不能为空！")
    @ApiModelProperty(value = "主键", required = true)
    private Long id;

    @NotNull(message = "旧密码不能为空！")
    @ApiModelProperty(value = "旧密码", required = true)
    private String oldPassword;

    @NotNull(message = "新密码不能为空！")
    @ApiModelProperty(value = "新密码", required = true)
    private String newPassword;

}