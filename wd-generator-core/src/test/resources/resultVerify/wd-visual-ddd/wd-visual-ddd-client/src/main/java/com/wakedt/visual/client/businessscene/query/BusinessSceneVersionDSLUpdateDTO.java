package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 更新业务场景DSL
 */
@Data
@ApiModel(description = "更新业务场景DSL")
public class BusinessSceneVersionDSLUpdateDTO {

    @NotNull
    @ApiModelProperty(value = "业务场景版本ID")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "图形DSL")
    public String graphDsl;

    @NotNull
    @ApiModelProperty(value = "业务场景DSL")
    public String businessSceneDsl;

}