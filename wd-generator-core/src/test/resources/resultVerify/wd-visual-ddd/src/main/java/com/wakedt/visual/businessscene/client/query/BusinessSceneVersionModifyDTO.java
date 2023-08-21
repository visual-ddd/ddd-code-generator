package com.wakedt.visual.businessscene.client.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 编辑业务场景版本
 */
@Data
@ApiModel(description = "编辑业务场景版本")
public class BusinessSceneVersionModifyDTO {

    @NotNull(message = "业务场景 ID不能为空！")
    @ApiModelProperty(value = "业务场景 ID" , required = true)
    private Long id;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

}