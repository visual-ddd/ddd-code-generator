package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 更新业务域DSL
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "更新业务域DSL")
public class DomainDesignDslUpdateDTO {

    @NotNull(message = "业务域场景ID不能为空！")
    @ApiModelProperty(value = "业务域场景ID" , required = true)
    private Long id;

    @NotNull(message = "业务域DSL不能为空！")
    @ApiModelProperty(value = "业务域DSL" , required = true)
    private String domainDesignDsl;

    @NotNull(message = "图形DSL不能为空！")
    @ApiModelProperty(value = "图形DSL" , required = true)
    private String graphDsl;

}