package com.wakedt.visual.application.client.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 关联业务场景版本
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Data
@ApiModel(description = "关联业务场景版本")
public class BusinessSceneVersionBindDTO {

    @NotNull(message = "应用版本ID不能为空！")
    @ApiModelProperty(value = "应用版本ID" , required = true)
    private Long id;

    @NotNull(message = "关联业务场景列表不能为空！")
    @ApiModelProperty(value = "关联业务场景列表" , required = true)
    private Set<Long> businessSceneVersionIds;

}