package com.wakedt.visual.client.businessservice.accountlogin.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.businessservice.accountlogin.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 账号登录
 */
@Data
@ApiModel(description = "账号登录")
public class Login {

    @NotNull
    @ApiModelProperty(value = "账号唯一标识（邮箱）")
    private LocalDateTime accountNo;

    @NotNull
    @ApiModelProperty(value = "密码")
    private String password;

}