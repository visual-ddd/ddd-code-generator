package com.wakedt.visual.client.businessservice.accountlogin.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 账号登录
 */
@Data
@ApiModel(value = "账号登录")
public class Login {

    @ApiModelProperty(value = "账号唯一标识（邮箱）")
    private String accountNo;

    @ApiModelProperty(value = "密码")
    private String password;

}