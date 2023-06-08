package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 绑定组织管理员
 */
@Data
@ApiModel(description = "绑定组织管理员")
public class OrganizationManagerBindDTO {

    @ApiModelProperty(value = "组织 ID")
    public Long id;

    @ApiModelProperty(value = "组织管理员")
    public Long organizationManagerId;

}