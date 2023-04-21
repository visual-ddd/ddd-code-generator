package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 编辑应用
 */
@Data
@ApiModel(value = "编辑应用")
public class ApplicationModifyDTO {

    @ApiModelProperty(value = "应用 ID")
    public Long id;

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "包名")
    public String packageName;

    @ApiModelProperty(value = "描述")
    public String description;

}