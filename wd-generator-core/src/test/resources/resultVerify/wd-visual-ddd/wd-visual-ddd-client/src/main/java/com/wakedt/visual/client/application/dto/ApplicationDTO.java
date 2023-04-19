package com.wakedt.visual.client.application.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;

/**
 * 用于应用的数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用于应用的数据传输对象")
public class ApplicationDTO extends BaseDTO {

    @ApiModelProperty(value = "应用 ID")
    private Long id;

    @ApiModelProperty(value = "团队的唯一标识")
    private Long teamId;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "唯一标识，此处使用大驼峰命名")
    private String identity;

    @ApiModelProperty(value = "生成项目时的包结构")
    private String packageName;

    @ApiModelProperty(value = "描述信息")
    private String description;

}