package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;

/**
 * 绑定团队成员职位
 */
@Data
@ApiModel(value = "绑定团队成员职位")
public class TeamMemberRoleBindDTO {

    @ApiModelProperty(value = "团队成员ID")
    public Long id;

    @ApiModelProperty(value = "成员类型标签")
    public List<Integer> memberTypeList;

}