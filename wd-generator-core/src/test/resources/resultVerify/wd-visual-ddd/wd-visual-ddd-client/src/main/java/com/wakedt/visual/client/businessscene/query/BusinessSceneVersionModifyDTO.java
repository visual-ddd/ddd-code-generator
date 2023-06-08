package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 编辑业务场景版本
 */
@Data
@ApiModel(description = "编辑业务场景版本")
public class BusinessSceneVersionModifyDTO {

    @NotNull
    @ApiModelProperty(value = "业务场景 ID")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "描述")
    public String description;

}