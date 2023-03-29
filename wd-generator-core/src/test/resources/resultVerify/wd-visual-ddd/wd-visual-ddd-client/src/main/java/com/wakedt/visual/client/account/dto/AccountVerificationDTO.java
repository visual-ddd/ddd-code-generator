package com.wakedt.visual.client.account.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 用于账号验证码的数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用于账号验证码的数据传输对象")
public class AccountVerificationDTO extends BaseDTO {

    @ApiModelProperty(value = "实体唯一标识符")
    private Long id;

    @ApiModelProperty(value = "验证码")
    private String code;

    @ApiModelProperty(value = "用户登录的唯一标识，目前以用户邮箱作为账号")
    private String accountNo;

}