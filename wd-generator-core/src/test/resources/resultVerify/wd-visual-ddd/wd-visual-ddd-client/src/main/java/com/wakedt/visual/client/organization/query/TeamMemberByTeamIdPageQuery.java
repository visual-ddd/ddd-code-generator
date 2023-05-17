package com.wakedt.visual.client.organization.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 查询团队下的成员信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "查询团队下的成员信息")
public class TeamMemberByTeamIdPageQuery extends PageQuery {

    @ApiModelProperty(value = "团队ID")
    private Long teamId;

}