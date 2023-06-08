package com.wakedt.visual.client.organization.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 组织数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "组织数据传输对象")
public class OrganizationDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "组织 ID")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "名称")
    private String name;

    @NotNull
    @ApiModelProperty(value = "描述")
    private String description;

    @NotNull
    @ApiModelProperty(value = "组织管理员")
    private Long organizationManagerId;

}