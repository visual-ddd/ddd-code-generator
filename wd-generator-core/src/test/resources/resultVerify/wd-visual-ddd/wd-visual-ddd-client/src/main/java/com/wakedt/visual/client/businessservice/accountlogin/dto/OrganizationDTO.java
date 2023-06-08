package com.wakedt.visual.client.businessservice.accountlogin.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 组织信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "组织信息")
public class OrganizationDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "组织ID")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "名称")
    private String name;

    @NotNull
    @ApiModelProperty(value = "描述")
    private String description;

    @NotNull
    @ApiModelProperty(value = "组织管理员")
    private String organizationManagerId;

}