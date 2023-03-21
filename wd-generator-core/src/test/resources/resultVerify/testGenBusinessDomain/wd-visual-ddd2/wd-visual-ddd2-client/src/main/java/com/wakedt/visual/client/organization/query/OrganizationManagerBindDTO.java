package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 绑定组织管理员
 */
@Data
@ApiModel(value = "绑定组织管理员")
public class OrganizationManagerBindDTO {

    @ApiModelProperty(value = "组织 ID")
    public Long id;

    @ApiModelProperty(value = "组织的管理者，被系统管理员授权，管理自己所在组织下的所有团队。")
    public Long organizationTeamManagerId;
}