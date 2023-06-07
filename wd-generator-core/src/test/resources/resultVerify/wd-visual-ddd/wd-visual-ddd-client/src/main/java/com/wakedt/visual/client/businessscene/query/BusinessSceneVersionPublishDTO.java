package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 发布业务场景版本
 */
@Data
@ApiModel(description = "发布业务场景版本")
public class BusinessSceneVersionPublishDTO {

    @ApiModelProperty(value = "业务场景版本ID")
    public Long id;

}