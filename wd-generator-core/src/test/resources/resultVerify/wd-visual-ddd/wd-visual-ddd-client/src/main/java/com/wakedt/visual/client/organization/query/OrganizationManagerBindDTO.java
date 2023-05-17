package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 绑定组织管理员
 */
@Data
@ApiModel(value = "绑定组织管理员")
public class OrganizationManagerBindDTO {

    @ApiModelProperty(value = "组织 ID")
    public Long id;

    @ApiModelProperty(value = "组织管理员")
    public Long organizationManagerId;

}