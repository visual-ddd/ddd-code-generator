package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 添加团队成员
 */
@Data
@ApiModel(value = "添加团队成员")
public class TeamMemberAddDTO {

    @ApiModelProperty(value = "团队成员的账号唯一标识")
    public Long accountId;

    @ApiModelProperty(value = "团队唯一标识")
    public Long teamId;

    @ApiModelProperty(value = "成员类型标签")
    public List<Integer> memberTypeList;

}