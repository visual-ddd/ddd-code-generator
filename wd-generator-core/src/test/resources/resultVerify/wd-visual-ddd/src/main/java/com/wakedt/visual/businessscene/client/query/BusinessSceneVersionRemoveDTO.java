package com.wakedt.visual.businessscene.client.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 删除业务场景版本
 */
@Data
@ApiModel(description = "删除业务场景版本")
public class BusinessSceneVersionRemoveDTO {

    @NotNull(message = "业务场景 ID不能为空！")
    @ApiModelProperty(value = "业务场景 ID" , required = true)
    private Long id;

}