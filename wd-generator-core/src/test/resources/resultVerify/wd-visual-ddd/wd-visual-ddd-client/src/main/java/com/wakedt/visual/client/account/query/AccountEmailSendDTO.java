package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 发送重置密码邮件
 */
@Data
@ApiModel(value = "发送重置密码邮件")
public class AccountEmailSendDTO {

    @ApiModelProperty(value = "用户登录的唯一标识，目前以用户邮箱作为账号")
    public String accountNo;

}