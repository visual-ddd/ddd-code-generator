package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 更新账号基本信息
 */
@Data
@ApiModel(value = "更新账号基本信息")
public class AccountModifyDTO {

    @ApiModelProperty(value = "用户 ID")
    public Long id;

    @ApiModelProperty(value = "描述")
    public String description;

    @ApiModelProperty(value = "用户名")
    public String userName;

    @ApiModelProperty(value = "账号")
    public String accountNo;

    @ApiModelProperty(value = "密码")
    public String newPassword;

    @ApiModelProperty(value = "用户头像")
    public String icon;

}