package com.wakedt.visual.client.organization.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 分页查询团队成员
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "分页查询团队成员")
public class TeamMemberByTeamIdPageQuery extends PageQuery {

    @ApiModelProperty(value = "团队唯一标识")
    private Long teamId;

}