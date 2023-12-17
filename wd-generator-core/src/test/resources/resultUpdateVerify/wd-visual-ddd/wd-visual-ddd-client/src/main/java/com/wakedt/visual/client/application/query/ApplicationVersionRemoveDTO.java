package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 删除应用版本
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "删除应用版本")
public class ApplicationVersionRemoveDTO {

    @NotNull(message = "应用版本ID不能为空！")
    @ApiModelProperty(value = "应用版本ID" , required = true)
    private Long id;

}