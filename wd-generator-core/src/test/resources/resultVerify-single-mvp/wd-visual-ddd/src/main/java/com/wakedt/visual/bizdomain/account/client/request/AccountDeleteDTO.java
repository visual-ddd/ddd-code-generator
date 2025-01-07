package com.wakedt.visual.bizdomain.account.client.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 删除账号
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@ApiModel(description = "删除账号")
public class AccountDeleteDTO {

    @NotNull(message = "用户 ID不能为空！")
    @ApiModelProperty(value = "用户 ID", required = true)
    private Long id;

}