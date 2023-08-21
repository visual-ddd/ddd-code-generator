package com.wakedt.visual.businessscene.client.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 业务场景数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景数据传输对象")
public class BusinessSceneDTO extends BaseDTO {

    @NotNull(message = "业务场景 ID不能为空！")
    @ApiModelProperty(value = "业务场景 ID" , required = true)
    private Long id;

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID" , required = true)
    private Long teamId;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称" , required = true)
    private String name;

    @NotNull(message = "标识符不能为空！")
    @ApiModelProperty(value = "标识符" , required = true)
    private String identity;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述" , required = true)
    private String description;

}