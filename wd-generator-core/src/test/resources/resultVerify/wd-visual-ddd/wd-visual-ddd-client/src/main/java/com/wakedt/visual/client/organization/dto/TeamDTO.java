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
 * 团队数据传输对象
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "团队数据传输对象")
public class TeamDTO extends BaseDTO {

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID", required = true)
    private Long id;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称", required = true)
    private String name;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述", required = true)
    private String description;

    @NotNull(message = "组织ID不能为空！")
    @ApiModelProperty(value = "组织ID", required = true)
    private Long organizationId;

    @NotNull(message = "团队管理员不能为空！")
    @ApiModelProperty(value = "团队管理员", required = true)
    private Long teamManagerId;

}