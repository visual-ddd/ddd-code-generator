package com.wakedt.visual.client.businessscene.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 新增业务场景版本
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "新增业务场景版本")
public class BusinessSceneVersionCreateDTO {

    @NotNull(message = "业务场景ID不能为空！")
    @ApiModelProperty(value = "业务场景ID", required = true)
    private Long businessSceneId;

    @NotNull(message = "描述不能为空！")
    @ApiModelProperty(value = "描述", required = true)
    private String description;

    @NotNull(message = "起始版本号不能为空！")
    @ApiModelProperty(value = "起始版本号", required = true)
    private String startVersion;

    @NotNull(message = "当前版本号不能为空！")
    @ApiModelProperty(value = "当前版本号", required = true)
    private String currentVersion;

}