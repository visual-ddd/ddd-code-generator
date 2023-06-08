package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 新增组织
 */
@Data
@ApiModel(description = "新增组织")
public class OrganizationCreateDTO {

    @NotNull
    @ApiModelProperty(value = "名称")
    public String name;

    @NotNull
    @ApiModelProperty(value = "描述")
    public String description;

    @NotNull
    @ApiModelProperty(value = "组织管理员")
    public Long organizationManagerId;

}