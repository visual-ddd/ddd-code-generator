package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 新增业务场景版本
 */
@Data
@ApiModel(value = "新增业务场景版本")
public class BusinessSceneVersionCreateDTO {

    @ApiModelProperty(value = "业务场景的唯一标识")
    public Long businessSceneId;

    @ApiModelProperty(value = "描述信息")
    public String description;

    @ApiModelProperty(value = "第一次创建时，需要指定起始版本号")
    public String startVersion;

    @ApiModelProperty(value = "当前版本的唯一标识")
    public String currentVersion;

}