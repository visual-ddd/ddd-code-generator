package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Fork业务场景版本
 */
@Data
@ApiModel(value = "Fork业务场景版本")
public class BusinessSceneVersionForkDTO {

    @ApiModelProperty(value = "基版本的唯一标识")
    public Long startVersionId;

    @ApiModelProperty(value = "当前版本的唯一标识")
    public String currentVersion;

    @ApiModelProperty(value = "描述信息")
    public String description;

}