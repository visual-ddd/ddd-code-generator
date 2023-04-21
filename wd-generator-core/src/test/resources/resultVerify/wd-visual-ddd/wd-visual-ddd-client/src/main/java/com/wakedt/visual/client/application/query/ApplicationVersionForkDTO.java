package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * Fork应用版本
 */
@Data
@ApiModel(value = "Fork应用版本")
public class ApplicationVersionForkDTO {

    @ApiModelProperty(value = "基版本的唯一标识")
    public Long startVersionId;

    @ApiModelProperty(value = "当前版本号")
    public String currentVersion;

    @ApiModelProperty(value = "描述")
    public String description;

}