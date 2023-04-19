package com.wakedt.visual.client.organization.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 查询团队详情
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "查询团队详情")
public class TeamQuery extends BaseQuery {

    @ApiModelProperty(value = "团队ID")
    private Long id;

}