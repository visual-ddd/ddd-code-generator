package com.wakedt.visual.account.client.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 发送重置密码邮件
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
@ApiModel(description = "发送重置密码邮件")
public class AccountEmailSendDTO {

    @NotNull(message = "账号ID不能为空！")
    @ApiModelProperty(value = "账号ID" , required = true)
    private Long id;

}