package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 删除团队
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "删除团队")
public class TeamRemoveDTO {

    @NotNull(message = "团队 ID不能为空！")
    @ApiModelProperty(value = "团队 ID" , required = true)
    private Long id;

}