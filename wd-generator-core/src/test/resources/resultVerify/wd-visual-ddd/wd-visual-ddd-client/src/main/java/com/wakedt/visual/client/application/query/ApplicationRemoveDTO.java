package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 删除应用
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "删除应用")
public class ApplicationRemoveDTO {

    @NotNull(message = "应用 ID不能为空！")
    @ApiModelProperty(value = "应用 ID" , required = true)
    private Long id;

}