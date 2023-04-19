package com.wakedt.visual.client.businessscene.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 查询业务场景版本详情
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "查询业务场景版本详情")
public class BusinessSceneVersionQuery extends BaseQuery {

    @ApiModelProperty(value = "业务场景版本ID")
    private Long id;

}