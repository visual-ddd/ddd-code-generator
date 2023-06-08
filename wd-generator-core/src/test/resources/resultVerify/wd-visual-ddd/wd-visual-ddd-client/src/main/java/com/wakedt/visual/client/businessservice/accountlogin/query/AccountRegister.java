package com.wakedt.visual.client.businessservice.accountlogin.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.businessservice.accountlogin.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 注册账号
 */
@Data
@ApiModel(description = "注册账号")
public class AccountRegister {

    @NotNull(message = "验证码不能为空！")
    @ApiModelProperty(value = "验证码")
    private String code;

    @NotNull(message = "账号(唯一标识)不能为空！")
    @ApiModelProperty(value = "账号(唯一标识)")
    private String accountNo;

    @NotNull(message = "用户名不能为空！")
    @ApiModelProperty(value = "用户名")
    private String userName;

    @NotNull(message = "密码不能为空！")
    @ApiModelProperty(value = "密码")
    private String password;

    @NotNull(message = "用户头像不能为空！")
    @ApiModelProperty(value = "用户头像")
    private String icon;

}