package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 重置用户密码
 */
@Data
@ApiModel(description = "重置用户密码")
public class AccountPasswordResetDTO {

    @NotNull
    @ApiModelProperty(value = "重置密码唯一标识")
    public String uuid;

    @NotNull
    @ApiModelProperty(value = "账号ID")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "密码")
    public String newPassword;

}