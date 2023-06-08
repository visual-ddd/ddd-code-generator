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
 * 账号详情查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "账号详情查询对象")
public class AccountDetailQuery extends BaseQuery {

    @NotNull
    @ApiModelProperty(value = "用户 ID")
    private Long id;

}