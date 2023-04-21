package com.wakedt.visual.client.account.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;

/**
 * 账号验证码数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "账号验证码数据传输对象")
public class AccountVerificationDTO extends BaseDTO {

    @ApiModelProperty(value = "实体唯一标识符")
    private Long id;

    @ApiModelProperty(value = "验证码")
    private String code;

    @ApiModelProperty(value = "账号标识")
    private String accountNo;

}