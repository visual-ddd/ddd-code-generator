package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 发布应用版本
 */
@Data
@ApiModel(description = "发布应用版本")
public class ApplicationVersionPublishDTO {

    @ApiModelProperty(value = "应用版本ID")
    public Long id;

}