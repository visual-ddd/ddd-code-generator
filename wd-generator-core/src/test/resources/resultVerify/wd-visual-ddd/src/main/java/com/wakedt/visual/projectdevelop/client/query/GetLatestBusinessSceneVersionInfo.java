package com.wakedt.visual.projectdevelop.client.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 获取最新业务场景版本信息
 */
@Data
@ApiModel(description = "获取最新业务场景版本信息")
public class GetLatestBusinessSceneVersionInfo {

    @NotNull(message = "业务场景的唯一标识不能为空！")
    @ApiModelProperty(value = "业务场景的唯一标识" , required = true)
    private Long id;

}