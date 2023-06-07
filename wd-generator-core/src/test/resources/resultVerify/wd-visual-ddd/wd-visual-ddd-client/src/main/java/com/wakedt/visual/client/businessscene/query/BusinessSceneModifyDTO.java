package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 编辑业务场景
 */
@Data
@ApiModel(description = "编辑业务场景")
public class BusinessSceneModifyDTO {

    @ApiModelProperty(value = "业务场景 ID")
    public Long id;

    @ApiModelProperty(value = "名称")
    public String name;

    @ApiModelProperty(value = "描述")
    public String description;

}