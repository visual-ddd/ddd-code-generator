package com.wakedt.visual.account.client.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 账号验证码数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "账号验证码数据传输对象")
public class AccountVerificationDTO extends BaseDTO {

    @NotNull(message = "实体唯一标识符不能为空！")
    @ApiModelProperty(value = "实体唯一标识符" , required = true)
    private Long id;

    @NotNull(message = "验证码不能为空！")
    @ApiModelProperty(value = "验证码" , required = true)
    private String code;

    @NotNull(message = "账号标识不能为空！")
    @ApiModelProperty(value = "账号标识" , required = true)
    private String accountNo;

}