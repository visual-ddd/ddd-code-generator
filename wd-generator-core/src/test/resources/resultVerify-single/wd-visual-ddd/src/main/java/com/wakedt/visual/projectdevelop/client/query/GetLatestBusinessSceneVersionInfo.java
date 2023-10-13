package com.wakedt.visual.projectdevelop.client.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.projectdevelop.client.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 获取最新业务场景版本信息
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:49
 */
@Data
@ApiModel(description = "获取最新业务场景版本信息")
public class GetLatestBusinessSceneVersionInfo {

    @NotNull(message = "业务场景的唯一标识不能为空！")
    @ApiModelProperty(value = "业务场景的唯一标识" , required = true)
    private Long id;

}