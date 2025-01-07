package com.wakedt.visual.bizdomain.businessscene.client.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 发布业务场景版本
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@ApiModel(description = "发布业务场景版本")
public class BusinessSceneVersionPublishDTO {

    @NotNull(message = "业务场景版本ID不能为空！")
    @ApiModelProperty(value = "业务场景版本ID", required = true)
    private Long id;

}