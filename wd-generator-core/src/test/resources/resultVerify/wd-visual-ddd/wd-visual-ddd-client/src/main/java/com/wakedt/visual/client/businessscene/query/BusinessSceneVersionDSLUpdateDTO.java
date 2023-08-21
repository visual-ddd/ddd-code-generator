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

    @NotNull(message = "业务场景版本ID不能为空！")
    @ApiModelProperty(value = "业务场景版本ID" , required = true)
    private Long id;

    @NotNull(message = "图形DSL不能为空！")
    @ApiModelProperty(value = "图形DSL" , required = true)
    private String graphDsl;

    @NotNull(message = "业务场景DSL不能为空！")
    @ApiModelProperty(value = "业务场景DSL" , required = true)
    private String businessSceneDsl;

}