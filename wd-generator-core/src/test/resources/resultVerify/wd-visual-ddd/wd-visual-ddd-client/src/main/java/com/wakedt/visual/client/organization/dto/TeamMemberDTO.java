package com.wakedt.visual.client.organization.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 团队成员数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "团队成员数据传输对象")
public class TeamMemberDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "团队成员ID")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @NotNull
    @ApiModelProperty(value = "成员账号ID")
    private Long accountId;

    @NotNull
    @ApiModelProperty(value = "成员类型标签")
    private List<Integer> memberTypeList;

}