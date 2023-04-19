package com.wakedt.visual.client.businessscene.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 业务场景列表查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "业务场景列表查询对象")
public class BusinessSceneListQuery extends BaseQuery {

    @ApiModelProperty(value = "业务场景的唯一标识列表")
    private List<Long> idList;

}