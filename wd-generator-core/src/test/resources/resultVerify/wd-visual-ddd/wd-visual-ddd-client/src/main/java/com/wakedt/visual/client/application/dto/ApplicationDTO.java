package com.wakedt.visual.client.application.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;

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

    @NotNull(message = "应用 ID不能为空！")
    @ApiModelProperty(value = "应用 ID")
    private Long id;

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

}