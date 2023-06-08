package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 绑定团队管理员
 */
@Data
@ApiModel(description = "绑定团队管理员")
public class TeamManagerBindDTO {

    @ApiModelProperty(value = "团队 ID")
    public Long id;

    @ApiModelProperty(value = "团队管理员")
    public Long teamManagerId;

}