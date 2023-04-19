package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 新增业务场景
 */
@Data
@ApiModel(value = "新增业务场景")
public class BusinessSceneCreateDTO {

    @ApiModelProperty(value = "团队的唯一标识")
    public Long teamId;

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "唯一标识，此处使用大驼峰命名")
    public String identity;

    @ApiModelProperty(value = "描述信息")
    public String description;

    @ApiModelProperty(value = "第一次创建时，需要指定起始版本号")
    public String startVersion;

}