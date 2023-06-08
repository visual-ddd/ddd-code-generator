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

    @NotNull
    @ApiModelProperty(value = "成员账号ID")
    public Long accountId;

    @NotNull
    @ApiModelProperty(value = "团队ID")
    public Long teamId;

    @NotNull
    @ApiModelProperty(value = "成员类型标签")
    public List<Integer> memberTypeList;

}