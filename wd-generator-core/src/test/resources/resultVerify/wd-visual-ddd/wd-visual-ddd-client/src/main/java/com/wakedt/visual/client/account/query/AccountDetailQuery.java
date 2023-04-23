package com.wakedt.visual.client.account.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.client.account.dto.*;

/**
 * 账号详情查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "账号详情查询对象")
public class AccountDetailQuery extends BaseQuery {

    @ApiModelProperty(value = "用户 ID")
    private Long id;

}