package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 修改用户密码
 */
@Data
@ApiModel(description = "修改用户密码")
public class AccountPasswordUpdateDTO {

    @ApiModelProperty(value = "主键")
    public Long id;

    @ApiModelProperty(value = "旧密码")
    public String oldPassword;

    @ApiModelProperty(value = "新密码")
    public String newPassword;

}