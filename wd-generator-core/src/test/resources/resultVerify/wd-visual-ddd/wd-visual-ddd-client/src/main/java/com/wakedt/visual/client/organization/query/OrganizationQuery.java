package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseQuery;
import com.wakedata.common.core.dto.PageQuery;
import lombok.EqualsAndHashCode;

/**
 * 查询组织详情
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "查询组织详情")
public class OrganizationQuery extends BaseQuery {

    @ApiModelProperty(value = "组织 ID")
    private Long id;

}