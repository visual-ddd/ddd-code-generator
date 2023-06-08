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
 * 团队数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "团队数据传输对象")
public class TeamDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "团队ID")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "名称")
    private String name;

    @NotNull
    @ApiModelProperty(value = "描述")
    private String description;

    @NotNull
    @ApiModelProperty(value = "组织ID")
    private Long organizationId;

    @NotNull
    @ApiModelProperty(value = "团队管理员")
    private Long teamManagerId;

}