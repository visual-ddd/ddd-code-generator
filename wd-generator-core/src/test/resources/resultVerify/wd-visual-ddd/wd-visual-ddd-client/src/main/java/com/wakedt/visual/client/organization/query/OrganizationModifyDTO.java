package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 编辑组织
 */
@Data
@ApiModel(description = "编辑组织")
public class OrganizationModifyDTO {

    @ApiModelProperty(value = "组织 ID")
    public Long id;

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "描述")
    public String description;

    @ApiModelProperty(value = "组织管理员")
    public Long organizationManagerId;

}