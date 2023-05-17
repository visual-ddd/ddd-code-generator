package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应用详情查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "应用详情查询对象")
public class ApplicationQuery extends BaseQuery {

    @ApiModelProperty(value = "应用 ID")
    private Long id;

}