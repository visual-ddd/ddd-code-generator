package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 应用详情查询对象
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用详情查询对象")
public class ApplicationQuery extends BaseQuery {

    @NotNull(message = "应用 ID不能为空！")
    @ApiModelProperty(value = "应用 ID", required = true)
    private Long id;

}