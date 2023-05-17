package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 发布业务场景版本
 */
@Data
@ApiModel(value = "发布业务场景版本")
public class BusinessSceneVersionPublishDTO {

    @ApiModelProperty(value = "业务场景版本ID")
    public Long id;

}