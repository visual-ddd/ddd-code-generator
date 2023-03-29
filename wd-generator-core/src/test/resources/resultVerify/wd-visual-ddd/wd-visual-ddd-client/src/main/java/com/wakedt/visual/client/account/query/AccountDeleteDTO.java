package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 删除账号
 */
@Data
@ApiModel(value = "删除账号")
public class AccountDeleteDTO {

    @ApiModelProperty(value = "用户 ID")
    public Long id;

}