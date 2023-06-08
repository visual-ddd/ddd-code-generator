package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 编辑团队
 */
@Data
@ApiModel(description = "编辑团队")
public class TeamModifyDTO {

    @NotNull
    @ApiModelProperty(value = "团队 ID")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "名称")
    public String name;

    @NotNull
    @ApiModelProperty(value = "描述")
    public String description;

    @NotNull
    @ApiModelProperty(value = "组织ID")
    public Long organizationId;

    @NotNull
    @ApiModelProperty(value = "团队管理员")
    public Long teamManagerId;

}