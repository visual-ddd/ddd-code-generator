package com.wakedt.visual.organization.client.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 编辑团队
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
@ApiModel(description = "编辑团队")
public class TeamModifyDTO {

    @NotNull(message = "团队 ID不能为空！")
    @ApiModelProperty(value = "团队 ID" , required = true)
    private Long id;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称" , required = true)
    private String name;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

    @NotNull(message = "组织ID不能为空！")
    @ApiModelProperty(value = "组织ID" , required = true)
    private Long organizationId;

    @NotNull(message = "团队管理员不能为空！")
    @ApiModelProperty(value = "团队管理员" , required = true)
    private Long teamManagerId;

}