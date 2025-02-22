package com.wakedt.visual.client.businessservice.secondarydevelopment.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 免鉴权获取业务域版本信息
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "免鉴权获取业务域版本信息")
public class GetDomainDesignVersionNoAuth {

    @NotNull(message = "业务域版本的唯一标识不能为空！")
    @ApiModelProperty(value = "业务域版本的唯一标识" , required = true)
    private Long id;

}