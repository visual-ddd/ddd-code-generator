package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 更新账号基本信息
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "更新账号基本信息")
public class AccountModifyDTO {

    @NotNull(message = "用户 ID不能为空！")
    @ApiModelProperty(value = "用户 ID", required = true)
    private Long id;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述", required = true)
    private String description;

    @NotNull(message = "用户名不能为空！")
    @ApiModelProperty(value = "用户名", required = true)
    private String userName;

    @NotNull(message = "账号不能为空！")
    @ApiModelProperty(value = "账号", required = true)
    private String accountNo;

    @NotNull(message = "密码不能为空！")
    @ApiModelProperty(value = "密码", required = true)
    private String newPassword;

    @NotNull(message = "用户头像不能为空！")
    @ApiModelProperty(value = "用户头像", required = true)
    private String icon;

}