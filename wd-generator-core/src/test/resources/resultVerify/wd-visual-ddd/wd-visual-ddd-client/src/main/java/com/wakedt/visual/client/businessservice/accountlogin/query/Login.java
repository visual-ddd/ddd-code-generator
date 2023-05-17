package com.wakedt.visual.client.businessservice.accountlogin.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 账号登录
 */
@Data
@ApiModel(value = "账号登录")
public class Login {

    @ApiModelProperty(value = "账号唯一标识（邮箱）")
    private LocalDateTime accountNo;

    @ApiModelProperty(value = "密码")
    private String password;

}