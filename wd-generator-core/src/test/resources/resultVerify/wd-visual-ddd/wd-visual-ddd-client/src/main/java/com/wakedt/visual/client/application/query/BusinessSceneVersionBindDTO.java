package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Set;

/**
 * 关联业务场景版本
 */
@Data
@ApiModel(description = "关联业务场景版本")
public class BusinessSceneVersionBindDTO {

    @ApiModelProperty(value = "应用版本ID")
    public Long id;

    @ApiModelProperty(value = "关联业务场景列表")
    public Set<Long> businessSceneVersionIds;

}