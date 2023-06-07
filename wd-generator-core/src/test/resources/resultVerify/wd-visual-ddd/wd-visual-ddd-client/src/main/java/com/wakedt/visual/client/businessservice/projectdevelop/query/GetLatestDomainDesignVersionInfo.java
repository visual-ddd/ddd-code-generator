package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 获取最新业务域版本信息
 */
@Data
@ApiModel(description = "获取最新业务域版本信息")
public class GetLatestDomainDesignVersionInfo {

    @ApiModelProperty(value = "业务域的唯一标识")
    private Long id;

}