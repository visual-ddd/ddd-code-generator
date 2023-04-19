package com.wakedt.visual.client.account.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 修改用户密码
 */
@Data
@ApiModel(value = "修改用户密码")
public class AccountPasswordUpdateDTO {

    @ApiModelProperty(value = "主键")
    public Long id;

    @ApiModelProperty(value = "旧密码")
    public String oldPassword;

    @ApiModelProperty(value = "新密码")
    public String newPassword;

}