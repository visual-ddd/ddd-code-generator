package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 新增业务场景
 */
@Data
@ApiModel(description = "新增业务场景")
public class BusinessSceneCreateDTO {

    @ApiModelProperty(value = "团队ID")
    public Long teamId;

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "标识符")
    public String identity;

    @ApiModelProperty(value = "描述")
    public String description;

    @ApiModelProperty(value = "起始版本号")
    public String startVersion;

}