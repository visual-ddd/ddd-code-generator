package com.wakedt.visual.application.client.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 编辑应用版本
 */
@Data
@ApiModel(description = "编辑应用版本")
public class ApplicationVersionModifyDTO {

    @NotNull(message = "应用版本ID不能为空！")
    @ApiModelProperty(value = "应用版本ID" , required = true)
    private Long id;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

}