package com.wakedt.visual.client.organization.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 分页查询团队
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "分页查询团队")
public class TeamPageQuery extends PageQuery {

    @ApiModelProperty(value = "组织唯一标识")
    private Long organizationId;

    @ApiModelProperty(value = "团队名称")
    private String name;

}