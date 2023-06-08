package com.wakedt.visual.client.organization.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;

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

    @NotNull(message = "团队成员ID不能为空！")
    @ApiModelProperty(value = "团队成员ID")
    private Long id;

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @NotNull(message = "成员账号ID不能为空！")
    @ApiModelProperty(value = "成员账号ID")
    private Long accountId;

    @NotNull(message = "成员类型标签不能为空！")
    @ApiModelProperty(value = "成员类型标签")
    private List<Integer> memberTypeList;

}