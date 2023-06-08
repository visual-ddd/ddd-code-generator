package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 创建账号
 */
@Data
@ApiModel(description = "创建账号")
public class AccountCreateDTO {

    @NotNull
    @ApiModelProperty(value = "用户名")
    public String userName;

    @NotNull
    @ApiModelProperty(value = "账号")
    public String accountNo;

    @NotNull
    @ApiModelProperty(value = "密码")
    public String password;

    @NotNull
    @ApiModelProperty(value = "用户头像")
    public String icon;

}