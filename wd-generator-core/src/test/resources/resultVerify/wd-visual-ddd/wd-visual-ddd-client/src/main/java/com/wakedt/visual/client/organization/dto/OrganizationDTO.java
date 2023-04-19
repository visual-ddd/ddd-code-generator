package com.wakedt.visual.client.organization.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;

/**
 * 用于组织的数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用于组织的数据传输对象")
public class OrganizationDTO extends BaseDTO {

    @ApiModelProperty(value = "组织 ID")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "组织的管理者，被系统管理员授权，管理自己所在组织下的所有团队。")
    private Long organizationManagerId;

}