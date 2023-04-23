package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.client.application.dto.*;

/**
 * 应用列表查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "应用列表查询对象")
public class ApplicationListQuery extends BaseQuery {

    @ApiModelProperty(value = "应用的唯一标识列表")
    private List<Long> idList;

}