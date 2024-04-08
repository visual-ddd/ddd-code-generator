package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 解绑组织管理员
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "解绑组织管理员")
public class OrganizationManagerUnbindDTO {

    @NotNull(message = "组织 ID不能为空！")
    @ApiModelProperty(value = "组织 ID", required = true)
    private Long id;

}