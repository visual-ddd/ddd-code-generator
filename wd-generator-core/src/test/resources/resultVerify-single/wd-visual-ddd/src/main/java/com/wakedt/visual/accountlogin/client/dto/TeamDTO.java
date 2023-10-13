package com.wakedt.visual.accountlogin.client.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;

/**
 * 团队信息
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:49
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "团队信息")
public class TeamDTO extends BaseDTO {

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID" , required = true)
    private Long id;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称" , required = true)
    private String name;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

    @NotNull(message = "团队管理员不能为空！")
    @ApiModelProperty(value = "团队管理员" , required = true)
    private String teamManagerId;

    @NotNull(message = "组织唯一标识不能为空！")
    @ApiModelProperty(value = "组织唯一标识" , required = true)
    private String organizationId;

}