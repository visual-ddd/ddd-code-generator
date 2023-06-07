package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 创建账号
 */
@Data
@ApiModel(description = "创建账号")
public class AccountCreateDTO {

    @ApiModelProperty(value = "用户名")
    public String userName;

    @ApiModelProperty(value = "账号")
    public String accountNo;

    @ApiModelProperty(value = "密码")
    public String password;

    @ApiModelProperty(value = "用户头像")
    public String icon;

}