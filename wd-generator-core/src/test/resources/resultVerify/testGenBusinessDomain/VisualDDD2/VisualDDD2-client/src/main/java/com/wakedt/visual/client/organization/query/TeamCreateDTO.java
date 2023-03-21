package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 新增团队
 */
@Data
@ApiModel(value = "新增团队")
public class TeamCreateDTO {

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "描述")
    public String description;

    @ApiModelProperty(value = "组织唯一标识")
    public Long organizationId;

    @ApiModelProperty(value = "团队的管理者，被组织管理员授权，管理自己所在团队")
    public Long teamManagerId;
}