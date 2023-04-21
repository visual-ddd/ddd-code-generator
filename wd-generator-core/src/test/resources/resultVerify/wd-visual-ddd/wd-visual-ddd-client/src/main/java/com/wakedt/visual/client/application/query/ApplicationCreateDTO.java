package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 新增应用
 */
@Data
@ApiModel(value = "新增应用")
public class ApplicationCreateDTO {

    @ApiModelProperty(value = "团队ID")
    public Long teamId;

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "标识符")
    public String identity;

    @ApiModelProperty(value = "包名")
    public String packageName;

    @ApiModelProperty(value = "描述")
    public String description;

    @ApiModelProperty(value = "起始版本号")
    public String startVersion;

}