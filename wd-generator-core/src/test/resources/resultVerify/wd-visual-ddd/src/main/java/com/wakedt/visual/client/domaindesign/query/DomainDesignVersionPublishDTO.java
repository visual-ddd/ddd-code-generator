package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 发布业务域版本
 */
@Data
@ApiModel(description = "发布业务域版本")
public class DomainDesignVersionPublishDTO {

    @NotNull(message = "业务域场景ID不能为空！")
    @ApiModelProperty(value = "业务域场景ID" , required = true)
    private Long id;

}