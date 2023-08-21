package com.wakedt.visual.application.client.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 删除应用
 */
@Data
@ApiModel(description = "删除应用")
public class ApplicationRemoveDTO {

    @NotNull(message = "应用 ID不能为空！")
    @ApiModelProperty(value = "应用 ID" , required = true)
    private Long id;

}