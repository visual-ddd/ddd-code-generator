package com.wakedt.visual.client.domaindesign.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 查询业务域详情
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "查询业务域详情")
public class DomainDesignQuery extends BaseQuery {

    @ApiModelProperty(value = "业务域 ID")
    private Long id;

}