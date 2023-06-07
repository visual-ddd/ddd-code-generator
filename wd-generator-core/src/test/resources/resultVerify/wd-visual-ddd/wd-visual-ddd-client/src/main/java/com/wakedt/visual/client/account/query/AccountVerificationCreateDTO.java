package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 创建验证码
 */
@Data
@ApiModel(description = "创建验证码")
public class AccountVerificationCreateDTO {

    @ApiModelProperty(value = "验证码")
    public String code;

    @ApiModelProperty(value = "账号标识")
    public String accountNo;

}