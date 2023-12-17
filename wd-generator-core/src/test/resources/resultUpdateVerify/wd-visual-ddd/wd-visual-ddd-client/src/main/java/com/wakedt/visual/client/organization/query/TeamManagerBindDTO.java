package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 绑定团队管理员
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "绑定团队管理员")
public class TeamManagerBindDTO {

    @NotNull(message = "团队 ID不能为空！")
    @ApiModelProperty(value = "团队 ID" , required = true)
    private Long id;

    @NotNull(message = "团队管理员不能为空！")
    @ApiModelProperty(value = "团队管理员" , required = true)
    private Long teamManagerId;

}