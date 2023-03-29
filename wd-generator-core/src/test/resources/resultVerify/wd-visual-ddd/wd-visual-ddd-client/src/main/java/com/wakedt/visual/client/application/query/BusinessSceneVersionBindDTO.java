package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 关联业务场景版本
 */
@Data
@ApiModel(value = "关联业务场景版本")
public class BusinessSceneVersionBindDTO {

    @ApiModelProperty(value = "应用版本ID")
    public Long id;

    @ApiModelProperty(value = "当前应用关联的业务场景版本ID列表")
    public Set<Long> businessSceneVersionIds;

}