package com.wakedt.visual.client.businessscene.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 分页查询业务场景
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "分页查询业务场景")
public class BusinessScenePageQuery extends PageQuery {

    @ApiModelProperty(value = "团队的唯一标识")
    private Long teamId;

    @ApiModelProperty(value = "名称")
    private String name;

}