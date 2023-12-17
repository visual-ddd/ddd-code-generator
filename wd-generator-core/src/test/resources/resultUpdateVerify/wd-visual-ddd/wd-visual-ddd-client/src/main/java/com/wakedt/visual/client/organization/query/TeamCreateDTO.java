package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 新增团队
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "新增团队")
public class TeamCreateDTO {

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称" , required = true)
    private String name;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

    @NotNull(message = "组织ID不能为空！")
    @ApiModelProperty(value = "组织ID" , required = true)
    private Long organizationId;

    @NotNull(message = "团队管理员不能为空！")
    @ApiModelProperty(value = "团队管理员" , required = true)
    private Long teamManagerId;

}