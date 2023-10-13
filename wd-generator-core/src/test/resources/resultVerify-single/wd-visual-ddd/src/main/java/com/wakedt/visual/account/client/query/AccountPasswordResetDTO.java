package com.wakedt.visual.account.client.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 重置用户密码
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
@ApiModel(description = "重置用户密码")
public class AccountPasswordResetDTO {

    @NotNull(message = "重置密码唯一标识不能为空！")
    @ApiModelProperty(value = "重置密码唯一标识" , required = true)
    private String uuid;

    @NotNull(message = "账号ID不能为空！")
    @ApiModelProperty(value = "账号ID" , required = true)
    private Long id;

    @NotNull(message = "密码不能为空！")
    @ApiModelProperty(value = "密码" , required = true)
    private String newPassword;

}