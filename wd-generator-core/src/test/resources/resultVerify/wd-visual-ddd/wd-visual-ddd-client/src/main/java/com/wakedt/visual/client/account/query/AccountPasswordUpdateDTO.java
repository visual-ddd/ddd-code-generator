package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 修改用户密码
 */
@Data
@ApiModel(description = "修改用户密码")
public class AccountPasswordUpdateDTO {

    @NotNull
    @ApiModelProperty(value = "主键")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "旧密码")
    public String oldPassword;

    @NotNull
    @ApiModelProperty(value = "新密码")
    public String newPassword;

}