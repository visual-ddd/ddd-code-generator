package com.wakedt.visual.client.application.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Set;

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