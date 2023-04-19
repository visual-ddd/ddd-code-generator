package com.wakedt.visual.client.businessservice.accountlogin.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 当前登录的账号信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "当前登录的账号信息")
public class AccountInfoDTO extends BaseDTO {

    @ApiModelProperty(value = "账号ID")
    private Long id;

    @ApiModelProperty(value = "账号(唯一标识)")
    private String accountNo;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "是否为系统管理员")
    private Boolean isAdmin;

    @ApiModelProperty(value = "sessionId")
    private String sessionId;

}