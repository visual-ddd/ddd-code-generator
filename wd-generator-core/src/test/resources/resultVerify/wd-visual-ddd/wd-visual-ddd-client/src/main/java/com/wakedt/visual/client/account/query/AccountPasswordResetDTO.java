package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 重置用户密码
 */
@Data
@ApiModel(description = "重置用户密码")
public class AccountPasswordResetDTO {

    @ApiModelProperty(value = "重置密码唯一标识")
    public String uuid;

    @ApiModelProperty(value = "账号ID")
    public Long id;

    @ApiModelProperty(value = "密码")
    public String newPassword;

}