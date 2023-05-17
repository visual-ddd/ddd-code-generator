package com.wakedt.visual.client.domaindesign.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 业务域详情查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "业务域详情查询对象")
public class DomainDesignQuery extends BaseQuery {

    @ApiModelProperty(value = "业务域 ID")
    private Long id;

}