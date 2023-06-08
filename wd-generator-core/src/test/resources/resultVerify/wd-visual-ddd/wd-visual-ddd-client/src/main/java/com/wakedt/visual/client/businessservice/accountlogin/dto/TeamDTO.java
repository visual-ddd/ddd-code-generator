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
 * 团队信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "团队信息")
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
    @ApiModelProperty(value = "团队管理员")
    private String teamManagerId;

    @NotNull
    @ApiModelProperty(value = "组织唯一标识")
    private String organizationId;

}