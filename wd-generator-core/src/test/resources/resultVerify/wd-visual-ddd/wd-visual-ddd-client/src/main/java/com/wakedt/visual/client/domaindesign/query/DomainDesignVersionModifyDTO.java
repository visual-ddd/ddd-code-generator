package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 编辑业务域版本
 */
@Data
@ApiModel(description = "编辑业务域版本")
public class DomainDesignVersionModifyDTO {

    @ApiModelProperty(value = "业务域场景ID")
    public Long id;

    @ApiModelProperty(value = "描述")
    public String description;

}