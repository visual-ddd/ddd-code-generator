package com.wakedt.visual.businessscene.client.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 应用最新版本查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用最新版本查询对象")
public class BusinessSceneLatestVersionQuery extends BaseQuery {

    @NotNull(message = "业务场景ID不能为空！")
    @ApiModelProperty(value = "业务场景ID" , required = true)
    private Long id;

}