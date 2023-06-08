package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 编辑业务场景
 */
@Data
@ApiModel(description = "编辑业务场景")
public class BusinessSceneModifyDTO {

    @NotNull
    @ApiModelProperty(value = "业务场景 ID")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "名称")
    public String name;

    @NotNull
    @ApiModelProperty(value = "描述")
    public String description;

}