package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 解绑组织管理员
 */
@Data
@ApiModel(value = "解绑组织管理员")
public class OrganizationManagerUnbindDTO {

    @ApiModelProperty(value = "组织 ID")
    public Long id;

}