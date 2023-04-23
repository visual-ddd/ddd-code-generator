package com.wakedt.visual.client.domaindesign.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.client.domaindesign.dto.*;

/**
 * 业务域列表查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "业务域列表查询对象")
public class DomainDesignListQuery extends BaseQuery {

    @ApiModelProperty(value = "业务域的唯一标识列表")
    private List<Long> idList;

}