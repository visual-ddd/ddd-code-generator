package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 新增应用版本
 */
@Data
@ApiModel(value = "新增应用版本")
public class ApplicationVersionCreateDTO {

    @ApiModelProperty(value = "应用的唯一标识")
    public Long applicationId;

    @ApiModelProperty(value = "第一次创建时，需要指定起始版本号")
    public String startVersion;

    @ApiModelProperty(value = "当前版本的唯一标识")
    public String currentVersion;

    @ApiModelProperty(value = "描述信息")
    public String description;

}