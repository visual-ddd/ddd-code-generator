package com.wakedt.visual.client.organization.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 团队分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "团队分页查询对象")
public class TeamPageQuery extends PageQuery {

    @ApiModelProperty(value = "组织ID")
    private Long organizationId;

    @ApiModelProperty(value = "团队名称")
    private String name;

}