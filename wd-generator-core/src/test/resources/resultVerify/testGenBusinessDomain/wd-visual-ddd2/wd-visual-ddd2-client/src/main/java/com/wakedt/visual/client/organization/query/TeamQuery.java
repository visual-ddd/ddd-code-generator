package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseQuery;
import com.wakedata.common.core.dto.PageQuery;
import lombok.EqualsAndHashCode;

/**
 * 查询团队详情
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "查询团队详情")
public class TeamQuery extends BaseQuery {

    @ApiModelProperty(value = "团队ID")
    private Long id;
}