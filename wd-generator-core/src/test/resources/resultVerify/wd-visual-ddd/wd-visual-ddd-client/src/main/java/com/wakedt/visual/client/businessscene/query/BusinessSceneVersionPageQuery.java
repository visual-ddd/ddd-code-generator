package com.wakedt.visual.client.businessscene.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 分页查询业务场景版本
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "分页查询业务场景版本")
public class BusinessSceneVersionPageQuery extends PageQuery {

    @ApiModelProperty(value = "业务场景的唯一标识")
    private String businessSceneId;

}