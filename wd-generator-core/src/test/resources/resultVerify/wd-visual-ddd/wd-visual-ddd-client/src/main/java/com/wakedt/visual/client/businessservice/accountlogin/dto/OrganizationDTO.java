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
@ApiModel(value = "组织信息")
public class OrganizationDTO extends BaseDTO {

    @ApiModelProperty(value = "组织ID")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "组织管理员")
    private String organizationManagerId;

}