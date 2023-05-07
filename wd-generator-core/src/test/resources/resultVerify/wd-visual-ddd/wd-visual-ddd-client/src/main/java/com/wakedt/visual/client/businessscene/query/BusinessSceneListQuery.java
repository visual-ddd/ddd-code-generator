package com.wakedt.visual.client.businessscene.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.client.businessscene.dto.*;

/**
 * 业务场景列表查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "业务场景列表查询对象")
public class BusinessSceneListQuery extends PageQuery {

    @ApiModelProperty(value = "业务场景的唯一标识列表")
    private List<Long> idList;

}