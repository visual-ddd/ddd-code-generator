package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 删除团队成员
 */
@Data
@ApiModel(description = "删除团队成员")
public class TeamMemberRemoveDTO {

    @NotNull(message = "团队成员ID不能为空！")
    @ApiModelProperty(value = "团队成员ID" , required = true)
    private Long id;

}