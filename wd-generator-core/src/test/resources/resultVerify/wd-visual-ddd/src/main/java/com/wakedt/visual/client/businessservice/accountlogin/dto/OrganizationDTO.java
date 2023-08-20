package com.wakedt.visual.client.businessservice.accountlogin.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 组织信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "组织信息")
public class OrganizationDTO extends BaseDTO {

    @NotNull(message = "组织ID不能为空！")
    @ApiModelProperty(value = "组织ID" , required = true)
    private Long id;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称" , required = true)
    private String name;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

    @NotNull(message = "组织管理员不能为空！")
    @ApiModelProperty(value = "组织管理员" , required = true)
    private String organizationManagerId;

}