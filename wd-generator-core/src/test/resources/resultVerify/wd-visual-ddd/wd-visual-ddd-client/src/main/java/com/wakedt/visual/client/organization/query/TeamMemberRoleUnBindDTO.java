package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 解绑团队成员职位
 */
@Data
@ApiModel(description = "解绑团队成员职位")
public class TeamMemberRoleUnBindDTO {

    @NotNull
    @ApiModelProperty(value = "团队成员ID")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "成员类型标签")
    public List<Integer> memberTypeList;

}