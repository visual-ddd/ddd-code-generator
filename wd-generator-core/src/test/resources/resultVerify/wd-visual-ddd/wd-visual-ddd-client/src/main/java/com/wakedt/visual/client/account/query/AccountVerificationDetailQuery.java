package com.wakedt.visual.client.account.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.account.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 账号验证码详情查询对象
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "账号验证码详情查询对象")
public class AccountVerificationDetailQuery extends BaseQuery {

    @NotNull(message = "账号标识不能为空！")
    @ApiModelProperty(value = "账号标识" , required = true)
    private String accountNo;

}