package com.wakedt.visual.secondarydevelopment.client.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.secondarydevelopment.client.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 免鉴权获取业务场景版本信息
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:57
 */
@Data
@ApiModel(description = "免鉴权获取业务场景版本信息")
public class GetBusinessSceneVersionNoAuth {

    @NotNull(message = "业务域版本的唯一标识不能为空！")
    @ApiModelProperty(value = "业务域版本的唯一标识" , required = true)
    private Long id;

}