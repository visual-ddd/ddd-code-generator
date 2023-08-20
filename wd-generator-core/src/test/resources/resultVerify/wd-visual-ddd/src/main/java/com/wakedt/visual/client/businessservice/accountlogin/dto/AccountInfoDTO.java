package com.wakedt.visual.client.businessservice.accountlogin.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 当前登录的账号信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "当前登录的账号信息")
public class AccountInfoDTO extends BaseDTO {

    @NotNull(message = "账号ID不能为空！")
    @ApiModelProperty(value = "账号ID" , required = true)
    private Long id;

    @NotNull(message = "账号(唯一标识)不能为空！")
    @ApiModelProperty(value = "账号(唯一标识)" , required = true)
    private String accountNo;

    @NotNull(message = "用户名不能为空！")
    @ApiModelProperty(value = "用户名" , required = true)
    private String userName;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

    @NotNull(message = "是否为系统管理员不能为空！")
    @ApiModelProperty(value = "是否为系统管理员" , required = true)
    private Boolean isAdmin;

    @NotNull(message = "sessionId不能为空！")
    @ApiModelProperty(value = "sessionId" , required = true)
    private String sessionId;

}