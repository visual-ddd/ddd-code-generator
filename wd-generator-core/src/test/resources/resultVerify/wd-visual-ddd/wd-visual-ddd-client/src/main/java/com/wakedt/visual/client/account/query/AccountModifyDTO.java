package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 更新账号基本信息
 */
@Data
@ApiModel(description = "更新账号基本信息")
public class AccountModifyDTO {

    @NotNull
    @ApiModelProperty(value = "用户 ID")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "描述")
    public String description;

    @NotNull
    @ApiModelProperty(value = "用户名")
    public String userName;

    @NotNull
    @ApiModelProperty(value = "账号")
    public String accountNo;

    @NotNull
    @ApiModelProperty(value = "密码")
    public String newPassword;

    @NotNull
    @ApiModelProperty(value = "用户头像")
    public String icon;

}