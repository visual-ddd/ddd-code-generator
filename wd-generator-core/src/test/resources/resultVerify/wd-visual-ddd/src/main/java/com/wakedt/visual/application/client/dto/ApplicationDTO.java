package com.wakedt.visual.application.client.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 应用数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用数据传输对象")
public class ApplicationDTO extends BaseDTO {

    @NotNull(message = "应用 ID不能为空！")
    @ApiModelProperty(value = "应用 ID" , required = true)
    private Long id;

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID" , required = true)
    private Long teamId;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称" , required = true)
    private String name;

    @NotNull(message = "标识符不能为空！")
    @ApiModelProperty(value = "标识符" , required = true)
    private String identity;

    @NotNull(message = "包名不能为空！")
    @ApiModelProperty(value = "包名" , required = true)
    private String packageName;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

}