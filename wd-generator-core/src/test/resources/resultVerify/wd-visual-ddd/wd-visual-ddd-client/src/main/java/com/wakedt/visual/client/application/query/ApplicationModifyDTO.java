package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 编辑应用
 */
@Data
@ApiModel(description = "编辑应用")
public class ApplicationModifyDTO {

    @NotNull
    @ApiModelProperty(value = "应用 ID")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "名称")
    public String name;

    @NotNull
    @ApiModelProperty(value = "包名")
    public String packageName;

    @NotNull
    @ApiModelProperty(value = "描述")
    public String description;

}