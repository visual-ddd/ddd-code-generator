package com.wakedt.visual.accountlogin.client.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.accountlogin.client.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 发送注册账号验证码
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:49
 */
@Data
@ApiModel(description = "发送注册账号验证码")
public class AccountVerificationCreate {

    @NotNull(message = "账号唯一标识（邮箱）不能为空！")
    @ApiModelProperty(value = "账号唯一标识（邮箱）" , required = true)
    private String accountNo;

    @NotNull(message = "验证码不能为空！")
    @ApiModelProperty(value = "验证码" , required = true)
    private String code;

}