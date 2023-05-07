package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 重置用户密码
 */
@Data
@ApiModel(value = "重置用户密码")
public class AccountPasswordResetDTO {

    @ApiModelProperty(value = "重置密码唯一标识")
    public String uuid;

    @ApiModelProperty(value = "账号ID")
    public Long id;

    @ApiModelProperty(value = "密码")
    public String newPassword;

}