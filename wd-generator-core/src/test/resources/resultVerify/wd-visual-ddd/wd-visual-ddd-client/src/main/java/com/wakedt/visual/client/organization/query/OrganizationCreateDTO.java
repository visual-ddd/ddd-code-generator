package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 新增组织
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "新增组织")
public class OrganizationCreateDTO {

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称", required = true)
    private String name;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述", required = true)
    private String description;

    @NotNull(message = "组织管理员不能为空！")
    @ApiModelProperty(value = "组织管理员", required = true)
    private Long organizationManagerId;

}