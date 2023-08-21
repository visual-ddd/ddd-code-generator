package com.wakedt.visual.application.client.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * Fork应用版本
 */
@Data
@ApiModel(description = "Fork应用版本")
public class ApplicationVersionForkDTO {

    @NotNull(message = "基版本的唯一标识不能为空！")
    @ApiModelProperty(value = "基版本的唯一标识" , required = true)
    private Long startVersionId;

    @NotNull(message = "当前版本号不能为空！")
    @ApiModelProperty(value = "当前版本号" , required = true)
    private String currentVersion;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

}