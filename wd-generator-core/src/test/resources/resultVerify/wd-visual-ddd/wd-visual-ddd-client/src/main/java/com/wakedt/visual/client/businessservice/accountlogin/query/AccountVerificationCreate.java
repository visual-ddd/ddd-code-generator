package com.wakedt.visual.client.businessservice.accountlogin.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 发送注册账号验证码
 */
@Data
@ApiModel(value = "发送注册账号验证码")
public class AccountVerificationCreate {

    @ApiModelProperty(value = "账号唯一标识（邮箱）")
    private String accountNo;

    @ApiModelProperty(value = "验证码")
    private String code;

}