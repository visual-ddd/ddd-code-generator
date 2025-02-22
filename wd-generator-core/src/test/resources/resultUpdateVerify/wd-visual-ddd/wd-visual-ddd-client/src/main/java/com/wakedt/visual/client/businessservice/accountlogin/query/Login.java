package com.wakedt.visual.client.businessservice.accountlogin.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * 账号登录
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "账号登录")
public class Login {

    @NotNull(message = "账号唯一标识（邮箱）不能为空！")
    @ApiModelProperty(value = "账号唯一标识（邮箱）" , required = true)
    private LocalDateTime accountNo;

    @NotNull(message = "密码不能为空！")
    @ApiModelProperty(value = "密码" , required = true)
    private String password;

}