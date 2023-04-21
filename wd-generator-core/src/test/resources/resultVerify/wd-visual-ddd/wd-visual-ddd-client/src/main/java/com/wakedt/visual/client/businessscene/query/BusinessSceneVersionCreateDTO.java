package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 新增业务场景版本
 */
@Data
@ApiModel(value = "新增业务场景版本")
public class BusinessSceneVersionCreateDTO {

    @ApiModelProperty(value = "业务场景ID")
    public Long businessSceneId;

    @ApiModelProperty(value = "描述")
    public String description;

    @ApiModelProperty(value = "起始版本号")
    public String startVersion;

    @ApiModelProperty(value = "当前版本号")
    public String currentVersion;

}