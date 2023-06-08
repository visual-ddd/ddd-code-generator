package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 绑定团队管理员
 */
@Data
@ApiModel(description = "绑定团队管理员")
public class TeamManagerBindDTO {

    @NotNull(message = "团队 ID不能为空！")
    @ApiModelProperty(value = "团队 ID")
    private Long id;

    @NotNull(message = "团队管理员不能为空！")
    @ApiModelProperty(value = "团队管理员")
    private Long teamManagerId;

}