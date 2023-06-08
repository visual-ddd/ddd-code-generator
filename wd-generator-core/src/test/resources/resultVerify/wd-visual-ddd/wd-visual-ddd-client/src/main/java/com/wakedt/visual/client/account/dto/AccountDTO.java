package com.wakedt.visual.client.account.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 账号数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "账号数据传输对象")
public class AccountDTO extends BaseDTO {

    @ApiModelProperty(value = "用户 ID")
    private Long id;

    @ApiModelProperty(value = "账号")
    private String accountNo;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "用户头像")
    private String icon;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "重置密码唯一标识")
    private String uuid;

}