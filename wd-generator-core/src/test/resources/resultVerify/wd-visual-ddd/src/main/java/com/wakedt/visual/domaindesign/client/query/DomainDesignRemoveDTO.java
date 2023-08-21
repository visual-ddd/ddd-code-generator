package com.wakedt.visual.domaindesign.client.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 删除业务域
 */
@Data
@ApiModel(description = "删除业务域")
public class DomainDesignRemoveDTO {

    @NotNull(message = "业务域 ID不能为空！")
    @ApiModelProperty(value = "业务域 ID" , required = true)
    private Long id;

}