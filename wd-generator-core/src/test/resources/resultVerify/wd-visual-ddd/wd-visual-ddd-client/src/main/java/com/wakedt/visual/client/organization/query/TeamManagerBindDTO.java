package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 绑定团队管理员
 */
@Data
@ApiModel(value = "绑定团队管理员")
public class TeamManagerBindDTO {

    @ApiModelProperty(value = "团队 ID")
    public Long id;

    @ApiModelProperty(value = "团队的管理者，被组织管理员授权，管理自己所在团队")
    public Long teamManagerId;

}