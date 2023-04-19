package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 编辑业务场景
 */
@Data
@ApiModel(value = "编辑业务场景")
public class BusinessSceneModifyDTO {

    @ApiModelProperty(value = "业务场景 ID")
    public Long id;

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "描述信息")
    public String description;

}