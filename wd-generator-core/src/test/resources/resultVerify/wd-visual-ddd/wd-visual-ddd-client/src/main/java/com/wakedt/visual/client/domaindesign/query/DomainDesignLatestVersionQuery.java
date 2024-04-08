package com.wakedt.visual.client.domaindesign.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 业务域最新版本查询对象
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域最新版本查询对象")
public class DomainDesignLatestVersionQuery extends BaseQuery {

    @NotNull(message = "业务域ID不能为空！")
    @ApiModelProperty(value = "业务域ID", required = true)
    private Long id;

}