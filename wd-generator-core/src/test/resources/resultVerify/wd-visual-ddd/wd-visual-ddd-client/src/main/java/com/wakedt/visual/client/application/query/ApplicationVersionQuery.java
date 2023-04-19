package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 查询应用版本详情
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "查询应用版本详情")
public class ApplicationVersionQuery extends BaseQuery {

    @ApiModelProperty(value = "应用版本ID")
    private Long id;

}