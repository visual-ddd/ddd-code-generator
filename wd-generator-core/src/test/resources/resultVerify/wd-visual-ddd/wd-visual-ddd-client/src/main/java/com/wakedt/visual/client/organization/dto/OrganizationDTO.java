package com.wakedt.visual.client.organization.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 组织数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "组织数据传输对象")
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