package com.wakedt.visual.bizdomain.account.client.request;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.account.client.response.*;
import javax.validation.constraints.NotNull;

/**
 * 账号验证码详情查询对象
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "账号验证码详情查询对象")
public class AccountVerificationDetailQuery extends BaseQuery {

    @NotNull(message = "账号标识不能为空！")
    @ApiModelProperty(value = "账号标识", required = true)
    private String accountNo;

}