package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 解绑团队管理员
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "解绑团队管理员")
public class TeamManagerUnBindDTO {

    @NotNull(message = "主键不能为空！")
    @ApiModelProperty(value = "主键", required = true)
    private Long id;

}