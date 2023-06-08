package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 编辑应用版本
 */
@Data
@ApiModel(description = "编辑应用版本")
public class ApplicationVersionModifyDTO {

    @NotNull
    @ApiModelProperty(value = "应用版本ID")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "描述")
    public String description;

}