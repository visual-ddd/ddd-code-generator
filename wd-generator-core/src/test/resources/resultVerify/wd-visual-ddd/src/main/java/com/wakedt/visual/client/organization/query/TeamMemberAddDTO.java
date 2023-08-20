package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 添加团队成员
 */
@Data
@ApiModel(description = "添加团队成员")
public class TeamMemberAddDTO {

    @NotNull(message = "成员账号ID不能为空！")
    @ApiModelProperty(value = "成员账号ID" , required = true)
    private Long accountId;

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID" , required = true)
    private Long teamId;

    @NotNull(message = "成员类型标签不能为空！")
    @ApiModelProperty(value = "成员类型标签" , required = true)
    private List<Integer> memberTypeList;

}