package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 关联业务场景版本
 */
@Data
@ApiModel(description = "关联业务场景版本")
public class BusinessSceneVersionBindDTO {

    @NotNull
    @ApiModelProperty(value = "应用版本ID")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "关联业务场景列表")
    public Set<Long> businessSceneVersionIds;

}