package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 发送重置密码邮件
 */
@Data
@ApiModel(description = "发送重置密码邮件")
public class AccountEmailSendDTO {

    @NotNull(message = "账号ID不能为空！")
    @ApiModelProperty(value = "账号ID" , required = true)
    private Long id;

}