package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 获取最新业务场景版本信息
 */
@Data
@ApiModel(value = "获取最新业务场景版本信息")
public class GetLatestBusinessSceneVersionInfo {

    @ApiModelProperty(value = "业务场景的唯一标识")
    private Long id;

}