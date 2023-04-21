package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 编辑应用版本
 */
@Data
@ApiModel(value = "编辑应用版本")
public class ApplicationVersionModifyDTO {

    @ApiModelProperty(value = "应用版本ID")
    public Long id;

    @ApiModelProperty(value = "描述")
    public String description;

}