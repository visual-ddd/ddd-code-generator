package com.wakedt.visual.client.organization.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 组织详情查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "组织详情查询对象")
public class OrganizationQuery extends BaseQuery {

    @ApiModelProperty(value = "组织 ID")
    private Long id;

}