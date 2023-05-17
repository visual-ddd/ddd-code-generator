package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 发布业务域版本
 */
@Data
@ApiModel(value = "发布业务域版本")
public class DomainDesignVersionPublishDTO {

    @ApiModelProperty(value = "业务域场景ID")
    public Long id;

}