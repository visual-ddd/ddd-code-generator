package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 新增应用版本
 */
@Data
@ApiModel(description = "新增应用版本")
public class ApplicationVersionCreateDTO {

    @NotNull
    @ApiModelProperty(value = "应用ID")
    public Long applicationId;

    @NotNull
    @ApiModelProperty(value = "起始版本号")
    public String startVersion;

    @NotNull
    @ApiModelProperty(value = "当前版本号")
    public String currentVersion;

    @NotNull
    @ApiModelProperty(value = "描述")
    public String description;

}