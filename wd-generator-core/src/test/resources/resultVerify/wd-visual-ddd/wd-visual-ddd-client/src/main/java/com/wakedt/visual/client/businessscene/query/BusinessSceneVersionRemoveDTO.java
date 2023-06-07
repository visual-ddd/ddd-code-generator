package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 删除业务场景版本
 */
@Data
@ApiModel(description = "删除业务场景版本")
public class BusinessSceneVersionRemoveDTO {

    @ApiModelProperty(value = "业务场景 ID")
    public Long id;

}