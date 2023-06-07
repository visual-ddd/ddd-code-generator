package com.wakedt.visual.client.domaindesign.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 删除业务域
 */
@Data
@ApiModel(description = "删除业务域")
public class DomainDesignRemoveDTO {

    @ApiModelProperty(value = "业务域 ID")
    public Long id;

}