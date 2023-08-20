package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 绑定团队成员职位
 */
@Data
@ApiModel(description = "绑定团队成员职位")
public class TeamMemberRoleBindDTO {

    @NotNull(message = "团队成员ID不能为空！")
    @ApiModelProperty(value = "团队成员ID" , required = true)
    private Long id;

    @NotNull(message = "成员类型标签不能为空！")
    @ApiModelProperty(value = "成员类型标签" , required = true)
    private List<Integer> memberTypeList;

}