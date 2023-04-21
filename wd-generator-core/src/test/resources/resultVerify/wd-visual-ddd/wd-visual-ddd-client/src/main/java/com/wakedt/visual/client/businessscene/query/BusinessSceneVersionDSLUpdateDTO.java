package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 更新业务场景DSL
 */
@Data
@ApiModel(value = "更新业务场景DSL")
public class BusinessSceneVersionDSLUpdateDTO {

    @ApiModelProperty(value = "业务场景版本ID")
    public Long id;

    @ApiModelProperty(value = "图形DSL")
    public String graphDsl;

    @ApiModelProperty(value = "业务场景DSL")
    public String businessSceneDsl;

}