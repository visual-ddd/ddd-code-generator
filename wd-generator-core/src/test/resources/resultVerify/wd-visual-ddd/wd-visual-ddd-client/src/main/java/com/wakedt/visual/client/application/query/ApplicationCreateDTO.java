package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 新增应用
 */
@Data
@ApiModel(description = "新增应用")
public class ApplicationCreateDTO {

    @NotNull
    @ApiModelProperty(value = "团队ID")
    public Long teamId;

    @NotNull
    @ApiModelProperty(value = "名称")
    public String name;

    @NotNull
    @ApiModelProperty(value = "标识符")
    public String identity;

    @NotNull
    @ApiModelProperty(value = "包名")
    public String packageName;

    @NotNull
    @ApiModelProperty(value = "描述")
    public String description;

    @NotNull
    @ApiModelProperty(value = "起始版本号")
    public String startVersion;

}