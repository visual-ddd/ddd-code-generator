package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 删除应用
 */
@Data
@ApiModel(description = "删除应用")
public class ApplicationRemoveDTO {

    @ApiModelProperty(value = "应用 ID")
    public Long id;

}