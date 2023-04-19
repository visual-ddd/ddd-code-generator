package com.wakedt.visual.client.account.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 查询账号详情
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "查询账号详情")
public class AccountDetailQuery extends BaseQuery {

    @ApiModelProperty(value = "用户 ID")
    private Long id;

}