package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 应用版本分页查询对象
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用版本分页查询对象")
public class ApplicationVersionPageQuery extends PageQuery {

    @NotNull(message = "应用ID不能为空！")
    @ApiModelProperty(value = "应用ID", required = true)
    private String applicationId;

}