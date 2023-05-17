package com.wakedt.visual.client.account.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 账号验证码详情查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "账号验证码详情查询对象")
public class AccountVerificationDetailQuery extends BaseQuery {

    @ApiModelProperty(value = "账号标识")
    private String accountNo;

}