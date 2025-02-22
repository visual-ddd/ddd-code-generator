package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 关联业务域版本
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "关联业务域版本")
public class DomainDesignVersionBindDTO {

    @NotNull(message = "应用版本ID不能为空！")
    @ApiModelProperty(value = "应用版本ID", required = true)
    private Long id;

    @NotNull(message = "关联业务域列表不能为空！")
    @ApiModelProperty(value = "关联业务域列表", required = true)
    private Set<Long> domainDesignVersionIds;

}