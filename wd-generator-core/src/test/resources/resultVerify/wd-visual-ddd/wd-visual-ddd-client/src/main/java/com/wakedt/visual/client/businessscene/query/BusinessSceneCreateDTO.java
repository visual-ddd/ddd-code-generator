package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 新增业务场景
 */
@Data
@ApiModel(description = "新增业务场景")
public class BusinessSceneCreateDTO {

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称")
    private String name;

    @NotNull(message = "标识符不能为空！")
    @ApiModelProperty(value = "标识符")
    private String identity;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述")
    private String description;

    @NotNull(message = "起始版本号不能为空！")
    @ApiModelProperty(value = "起始版本号")
    private String startVersion;

}