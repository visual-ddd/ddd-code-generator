package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * Fork业务场景版本
 */
@Data
@ApiModel(description = "Fork业务场景版本")
public class BusinessSceneVersionForkDTO {

    @NotNull
    @ApiModelProperty(value = "基版本的唯一标识")
    public Long startVersionId;

    @NotNull
    @ApiModelProperty(value = "当前版本号")
    public String currentVersion;

    @NotNull
    @ApiModelProperty(value = "描述")
    public String description;

}