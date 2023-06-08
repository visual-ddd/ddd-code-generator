package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 删除业务场景版本
 */
@Data
@ApiModel(description = "删除业务场景版本")
public class BusinessSceneVersionRemoveDTO {

    @NotNull
    @ApiModelProperty(value = "业务场景 ID")
    public Long id;

}