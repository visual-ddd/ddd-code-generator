package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 编辑组织
 */
@Data
@ApiModel(value = "编辑组织")
public class OrganizationModifyDTO {

    @ApiModelProperty(value = "组织 ID")
    public Long id;

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "描述")
    public String description;

    @ApiModelProperty(value = "组织的管理者，被系统管理员授权，管理自己所在组织下的所有团队。")
    public Long organizationManagerId;

}