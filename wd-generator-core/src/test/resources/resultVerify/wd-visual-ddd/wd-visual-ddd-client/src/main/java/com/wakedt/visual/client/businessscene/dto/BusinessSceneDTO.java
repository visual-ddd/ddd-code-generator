package com.wakedt.visual.client.businessscene.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 业务场景数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "业务场景数据传输对象")
public class BusinessSceneDTO extends BaseDTO {

    @ApiModelProperty(value = "业务场景 ID")
    private Long id;

    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "标识符")
    private String identity;

    @ApiModelProperty(value = "描述")
    private String description;

}