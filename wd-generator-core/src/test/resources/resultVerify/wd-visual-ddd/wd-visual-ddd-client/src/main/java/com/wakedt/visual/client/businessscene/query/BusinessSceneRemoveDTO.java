package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 删除业务场景
 */
@Data
@ApiModel(description = "删除业务场景")
public class BusinessSceneRemoveDTO {

    @ApiModelProperty(value = "业务场景 ID")
    public Long id;

}