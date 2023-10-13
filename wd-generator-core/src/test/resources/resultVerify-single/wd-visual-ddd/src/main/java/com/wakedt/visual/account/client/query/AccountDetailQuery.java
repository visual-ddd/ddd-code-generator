package com.wakedt.visual.account.client.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.account.client.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 账号详情查询对象
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "账号详情查询对象")
public class AccountDetailQuery extends BaseQuery {

    @NotNull(message = "用户 ID不能为空！")
    @ApiModelProperty(value = "用户 ID" , required = true)
    private Long id;

}