package com.wakedt.visual.client.businessservice.secondarydevelopment.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 获取应用关联的模块信息
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "获取应用关联的模块信息")
public class GetApplicationBindModelInfo {

    @NotNull(message = "应用的唯一标识不能为空！")
    @ApiModelProperty(value = "应用的唯一标识" , required = true)
    private Long applicationId;

}