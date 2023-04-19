package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 编辑业务场景版本
 */
@Data
@ApiModel(value = "编辑业务场景版本")
public class BusinessSceneVersionModifyDTO {

    @ApiModelProperty(value = "业务场景 ID")
    public Long id;

    @ApiModelProperty(value = "描述信息")
    public String description;

}