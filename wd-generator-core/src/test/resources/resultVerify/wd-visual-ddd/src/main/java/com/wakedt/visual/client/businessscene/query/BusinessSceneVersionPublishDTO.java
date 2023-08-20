package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 发布业务场景版本
 */
@Data
@ApiModel(description = "发布业务场景版本")
public class BusinessSceneVersionPublishDTO {

    @NotNull(message = "业务场景版本ID不能为空！")
    @ApiModelProperty(value = "业务场景版本ID" , required = true)
    private Long id;

}