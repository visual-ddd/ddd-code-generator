package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 删除应用版本
 */
@Data
@ApiModel(value = "删除应用版本")
public class ApplicationVersionRemoveDTO {

    @ApiModelProperty(value = "应用版本ID")
    public Long id;

}