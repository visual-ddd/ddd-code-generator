package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 新增应用版本
 */
@Data
@ApiModel(value = "新增应用版本")
public class ApplicationVersionCreateDTO {

    @ApiModelProperty(value = "应用ID")
    public Long applicationId;

    @ApiModelProperty(value = "起始版本号")
    public String startVersion;

    @ApiModelProperty(value = "当前版本号")
    public String currentVersion;

    @ApiModelProperty(value = "描述")
    public String description;

}