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
 * 团队分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "团队分页查询对象")
public class TeamPageQuery extends PageQuery {

    @NotNull
    @ApiModelProperty(value = "组织ID")
    private Long organizationId;

    @NotNull
    @ApiModelProperty(value = "团队名称")
    private String name;

}