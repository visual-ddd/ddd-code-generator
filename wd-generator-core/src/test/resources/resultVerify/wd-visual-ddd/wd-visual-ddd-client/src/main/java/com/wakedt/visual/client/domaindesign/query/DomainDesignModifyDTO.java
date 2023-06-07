package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 编辑业务域
 */
@Data
@ApiModel(description = "编辑业务域")
public class DomainDesignModifyDTO {

    @ApiModelProperty(value = "业务域 ID")
    public Long id;

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "描述")
    public String description;

}