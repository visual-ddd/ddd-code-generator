package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 删除业务场景
 */
@Data
@ApiModel(value = "删除业务场景")
public class BusinessSceneRemoveDTO {

    @ApiModelProperty(value = "业务场景 ID")
    public Long id;

}