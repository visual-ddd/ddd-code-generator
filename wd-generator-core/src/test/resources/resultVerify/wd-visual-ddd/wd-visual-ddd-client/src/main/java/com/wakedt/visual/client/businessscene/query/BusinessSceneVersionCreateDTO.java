package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 新增业务场景版本
 */
@Data
@ApiModel(description = "新增业务场景版本")
public class BusinessSceneVersionCreateDTO {

    @NotNull
    @ApiModelProperty(value = "业务场景ID")
    public Long businessSceneId;

    @NotNull
    @ApiModelProperty(value = "描述")
    public String description;

    @NotNull
    @ApiModelProperty(value = "起始版本号")
    public String startVersion;

    @NotNull
    @ApiModelProperty(value = "当前版本号")
    public String currentVersion;

}