package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 更新验证码
 */
@Data
@ApiModel(value = "更新验证码")
public class AccountVerificationUpdateDTO {

    @ApiModelProperty(value = "主键")
    public Long id;

    @ApiModelProperty(value = "验证码")
    public String code;

}