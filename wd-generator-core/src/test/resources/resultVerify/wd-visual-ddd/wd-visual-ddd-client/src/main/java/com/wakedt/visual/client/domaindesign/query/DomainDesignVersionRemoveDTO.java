package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 删除业务域版本
 */
@Data
@ApiModel(description = "删除业务域版本")
public class DomainDesignVersionRemoveDTO {

    @ApiModelProperty(value = "业务域场景ID")
    public Long id;

}