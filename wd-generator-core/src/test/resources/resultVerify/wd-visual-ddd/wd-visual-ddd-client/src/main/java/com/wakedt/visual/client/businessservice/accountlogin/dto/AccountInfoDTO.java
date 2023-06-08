package com.wakedt.visual.client.businessservice.accountlogin.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 当前登录的账号信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "当前登录的账号信息")
public class AccountInfoDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "账号ID")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "账号(唯一标识)")
    private String accountNo;

    @NotNull
    @ApiModelProperty(value = "用户名")
    private String userName;

    @NotNull
    @ApiModelProperty(value = "描述")
    private String description;

    @NotNull
    @ApiModelProperty(value = "是否为系统管理员")
    private Boolean isAdmin;

    @NotNull
    @ApiModelProperty(value = "sessionId")
    private String sessionId;

}