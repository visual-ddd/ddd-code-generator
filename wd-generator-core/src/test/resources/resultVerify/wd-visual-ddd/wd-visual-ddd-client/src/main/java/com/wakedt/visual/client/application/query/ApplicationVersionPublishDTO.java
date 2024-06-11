package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 发布应用版本
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "发布应用版本")
public class ApplicationVersionPublishDTO {

    @NotNull(message = "应用版本ID不能为空！")
    @ApiModelProperty(value = "应用版本ID", required = true)
    private Long id;

}