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

    @NotNull(message = "组织ID不能为空！")
    @ApiModelProperty(value = "组织ID" , required = true)
    private Long organizationId;

    @NotNull(message = "团队名称不能为空！")
    @ApiModelProperty(value = "团队名称" , required = true)
    private String name;

}