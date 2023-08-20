package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 应用版本详情查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用版本详情查询对象")
public class ApplicationVersionQuery extends BaseQuery {

    @NotNull(message = "应用版本ID不能为空！")
    @ApiModelProperty(value = "应用版本ID" , required = true)
    private Long id;

}