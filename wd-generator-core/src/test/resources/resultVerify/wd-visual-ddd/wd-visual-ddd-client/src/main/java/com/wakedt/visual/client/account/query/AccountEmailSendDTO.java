package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 发送重置密码邮件
 */
@Data
@ApiModel(description = "发送重置密码邮件")
public class AccountEmailSendDTO {

    @ApiModelProperty(value = "账号ID")
    public Long id;

}