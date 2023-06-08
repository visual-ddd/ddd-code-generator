package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 删除账号
 */
@Data
@ApiModel(description = "删除账号")
public class AccountDeleteDTO {

    @ApiModelProperty(value = "用户 ID")
    public Long id;

}