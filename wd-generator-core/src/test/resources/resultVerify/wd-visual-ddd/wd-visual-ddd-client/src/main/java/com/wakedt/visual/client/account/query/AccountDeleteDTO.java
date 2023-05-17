package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 删除账号
 */
@Data
@ApiModel(value = "删除账号")
public class AccountDeleteDTO {

    @ApiModelProperty(value = "用户 ID")
    public Long id;

}