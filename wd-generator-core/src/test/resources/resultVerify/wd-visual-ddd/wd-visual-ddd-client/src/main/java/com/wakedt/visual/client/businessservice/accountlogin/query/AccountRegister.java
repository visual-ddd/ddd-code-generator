package com.wakedt.visual.client.businessservice.accountlogin.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 校验注册验证码，创建账号
 */
@Data
@ApiModel(value = "校验注册验证码，创建账号")
public class AccountRegister {

    @ApiModelProperty(value = "验证码")
    private String code;

    @ApiModelProperty(value = "账号(唯一标识)")
    private String accountNo;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "用户头像")
    private String icon;

}