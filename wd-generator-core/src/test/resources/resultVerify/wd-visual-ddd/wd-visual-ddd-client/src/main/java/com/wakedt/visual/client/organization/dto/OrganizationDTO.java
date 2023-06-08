package com.wakedt.visual.client.organization.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;

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