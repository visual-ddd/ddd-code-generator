package com.wakedt.visual.client.account.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 查询账号验证码详情
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "查询账号验证码详情")
public class AccountVerificationDetailQuery extends BaseQuery {

    @ApiModelProperty(value = "用户登录的唯一标识，目前以用户邮箱作为账号")
    private String accountNo;

}