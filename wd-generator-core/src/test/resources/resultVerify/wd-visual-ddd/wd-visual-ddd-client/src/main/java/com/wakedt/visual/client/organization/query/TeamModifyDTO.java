package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 编辑团队
 */
@Data
@ApiModel(value = "编辑团队")
public class TeamModifyDTO {

    @ApiModelProperty(value = "团队 ID")
    public Long id;

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "描述")
    public String description;

    @ApiModelProperty(value = "组织ID")
    public Long organizationId;

    @ApiModelProperty(value = "团队管理员")
    public Long teamManagerId;

}