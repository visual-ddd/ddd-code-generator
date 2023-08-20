package com.wakedt.visual.client.organization.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 团队详情查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "团队详情查询对象")
public class TeamQuery extends BaseQuery {

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID" , required = true)
    private Long id;

}