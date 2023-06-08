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

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称")
    private String name;

    @NotNull(message = "标识符不能为空！")
    @ApiModelProperty(value = "标识符")
    private String identity;

    @NotNull(message = "包名不能为空！")
    @ApiModelProperty(value = "包名")
    private String packageName;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述")
    private String description;

    @NotNull(message = "起始版本号不能为空！")
    @ApiModelProperty(value = "起始版本号")
    private String startVersion;

}