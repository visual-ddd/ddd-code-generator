package com.wakedt.visual.organization.client.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 组织详情查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "组织详情查询对象")
public class OrganizationQuery extends BaseQuery {

    @ApiModelProperty(value = "组织 ID" )
    private Long id;

}