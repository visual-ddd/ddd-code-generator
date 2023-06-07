package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 绑定团队成员职位
 */
@Data
@ApiModel(description = "绑定团队成员职位")
public class TeamMemberRoleBindDTO {

    @ApiModelProperty(value = "团队成员ID")
    public Long id;

    @ApiModelProperty(value = "成员类型标签")
    public List<Integer> memberTypeList;

}