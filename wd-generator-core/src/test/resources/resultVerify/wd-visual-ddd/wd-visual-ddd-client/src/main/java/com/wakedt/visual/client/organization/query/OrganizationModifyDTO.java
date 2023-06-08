package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 编辑组织
 */
@Data
@ApiModel(description = "编辑组织")
public class OrganizationModifyDTO {

    @NotNull(message = "组织 ID不能为空！")
    @ApiModelProperty(value = "组织 ID")
    private Long id;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称")
    private String name;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述")
    private String description;

    @NotNull(message = "组织管理员不能为空！")
    @ApiModelProperty(value = "组织管理员")
    private Long organizationManagerId;

}