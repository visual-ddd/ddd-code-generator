package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 删除账号
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "删除账号")
public class AccountDeleteDTO {

    @NotNull(message = "用户 ID不能为空！")
    @ApiModelProperty(value = "用户 ID" , required = true)
    private Long id;

}