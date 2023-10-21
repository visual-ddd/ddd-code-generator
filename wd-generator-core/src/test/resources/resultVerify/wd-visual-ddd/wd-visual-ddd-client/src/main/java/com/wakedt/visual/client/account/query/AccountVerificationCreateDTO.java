package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 创建验证码
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "创建验证码")
public class AccountVerificationCreateDTO {

    @NotNull(message = "验证码不能为空！")
    @ApiModelProperty(value = "验证码" , required = true)
    private String code;

    @NotNull(message = "账号标识不能为空！")
    @ApiModelProperty(value = "账号标识" , required = true)
    private String accountNo;

}