package com.wakedt.visual.client.organization.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.organization.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 查询团队下的成员信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "查询团队下的成员信息")
public class TeamMemberByTeamIdPageQuery extends PageQuery {

    @NotNull
    @ApiModelProperty(value = "团队ID")
    private Long teamId;

}