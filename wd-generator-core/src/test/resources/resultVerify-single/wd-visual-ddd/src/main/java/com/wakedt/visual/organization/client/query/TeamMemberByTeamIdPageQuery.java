package com.wakedt.visual.organization.client.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.organization.client.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 查询团队下的成员信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "查询团队下的成员信息")
public class TeamMemberByTeamIdPageQuery extends PageQuery {

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID" , required = true)
    private Long teamId;

}