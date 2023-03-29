package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 重置用户密码
 */
@Data
@ApiModel(value = "重置用户密码")
public class AccountPasswordResetDTO {

    @ApiModelProperty(value = "用户重置密码时携带的唯一标识")
    public String uuid;

    @ApiModelProperty(value = "用户登录的唯一标识，目前以用户邮箱作为账号")
    public String accountNo;

    @ApiModelProperty(value = "密码")
    public String newPassword;

}