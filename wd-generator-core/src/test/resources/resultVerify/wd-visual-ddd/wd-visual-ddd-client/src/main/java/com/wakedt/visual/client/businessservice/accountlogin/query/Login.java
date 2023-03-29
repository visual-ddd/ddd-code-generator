package com.wakedt.visual.client.businessservice.accountlogin.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 验证账号密码，并返回用户信息，供存储到session
 */
@Data
@ApiModel(value = "验证账号密码，并返回用户信息，供存储到session")
public class Login {

    @ApiModelProperty(value = "账号唯一标识（邮箱）")
    private String accountNo;

    @ApiModelProperty(value = "密码")
    private String password;

}