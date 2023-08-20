package com.wakedt.visual.client.account.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 账号数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "账号数据传输对象")
public class AccountDTO extends BaseDTO {

    @NotNull(message = "用户 ID不能为空！")
    @ApiModelProperty(value = "用户 ID" , required = true)
    private Long id;

    @NotNull(message = "账号不能为空！")
    @ApiModelProperty(value = "账号" , required = true)
    private String accountNo;

    @NotNull(message = "用户名不能为空！")
    @ApiModelProperty(value = "用户名" , required = true)
    private String userName;

    @NotNull(message = "密码不能为空！")
    @ApiModelProperty(value = "密码" , required = true)
    private String password;

    @NotNull(message = "用户头像不能为空！")
    @ApiModelProperty(value = "用户头像" , required = true)
    private String icon;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

    @NotNull(message = "重置密码唯一标识不能为空！")
    @ApiModelProperty(value = "重置密码唯一标识" , required = true)
    private String uuid;

}