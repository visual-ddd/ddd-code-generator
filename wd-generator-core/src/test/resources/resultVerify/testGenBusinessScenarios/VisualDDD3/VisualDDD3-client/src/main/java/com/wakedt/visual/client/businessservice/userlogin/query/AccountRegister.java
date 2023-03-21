package com.wakedt.visual.client.businessservice.userlogin.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 注册账号
 */
@Data
@ApiModel(value = "注册账号")
public class AccountRegister {
    
    @ApiModelProperty(value = "验证码")
    private String code;
}