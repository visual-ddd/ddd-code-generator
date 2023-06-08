package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 添加团队成员
 */
@Data
@ApiModel(description = "添加团队成员")
public class TeamMemberAddDTO {

    @NotNull(message = "成员账号ID不能为空！")
    @ApiModelProperty(value = "成员账号ID")
    private Long accountId;

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @NotNull(message = "成员类型标签不能为空！")
    @ApiModelProperty(value = "成员类型标签")
    private List<Integer> memberTypeList;

}