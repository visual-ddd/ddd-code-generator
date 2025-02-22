package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 新增业务场景
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "新增业务场景")
public class BusinessSceneCreateDTO {

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

    @NotNull(message = "起始版本号不能为空！")
    @ApiModelProperty(value = "起始版本号" , required = true)
    private String startVersion;

}