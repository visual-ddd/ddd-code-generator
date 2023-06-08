package com.wakedt.visual.client.application.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 应用数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用数据传输对象")
public class ApplicationDTO extends BaseDTO {

    @ApiModelProperty(value = "应用 ID")
    private Long id;

    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "标识符")
    private String identity;

    @ApiModelProperty(value = "包名")
    private String packageName;

    @ApiModelProperty(value = "描述")
    private String description;

}