package com.wakedt.visual.client.account.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 账号验证码数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "账号验证码数据传输对象")
public class AccountVerificationDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "实体唯一标识符")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "验证码")
    private String code;

    @NotNull
    @ApiModelProperty(value = "账号标识")
    private String accountNo;

}