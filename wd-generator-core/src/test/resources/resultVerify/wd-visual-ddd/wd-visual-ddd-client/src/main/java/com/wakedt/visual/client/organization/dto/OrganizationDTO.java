package com.wakedt.visual.client.organization.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;

/**
 * 组织数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "组织数据传输对象")
public class OrganizationDTO extends BaseDTO {

    @ApiModelProperty(value = "组织 ID")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "组织管理员")
    private Long organizationManagerId;

}