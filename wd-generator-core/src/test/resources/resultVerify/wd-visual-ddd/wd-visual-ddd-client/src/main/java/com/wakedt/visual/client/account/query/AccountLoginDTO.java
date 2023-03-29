package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 账号登录
 */
@Data
@ApiModel(value = "账号登录")
public class AccountLoginDTO {

    @ApiModelProperty(value = "用户登录的唯一标识，目前以用户邮箱作为账号")
    public String accountNo;

    @ApiModelProperty(value = "密码")
    public String password;

}