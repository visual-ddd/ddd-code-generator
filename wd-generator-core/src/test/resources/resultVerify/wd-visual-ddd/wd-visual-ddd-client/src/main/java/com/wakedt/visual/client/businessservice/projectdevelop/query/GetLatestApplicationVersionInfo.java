package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 获取最新应用版本信息
 */
@Data
@ApiModel(value = "获取最新应用版本信息")
public class GetLatestApplicationVersionInfo {

    @ApiModelProperty(value = "应用的唯一标识")
    private Long id;

}