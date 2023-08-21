package com.wakedt.visual.organization.client.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 团队成员数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "团队成员数据传输对象")
public class TeamMemberDTO extends BaseDTO {

    @NotNull(message = "团队成员ID不能为空！")
    @ApiModelProperty(value = "团队成员ID" , required = true)
    private Long id;

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID" , required = true)
    private Long teamId;

    @NotNull(message = "成员账号ID不能为空！")
    @ApiModelProperty(value = "成员账号ID" , required = true)
    private Long accountId;

    @NotNull(message = "成员类型标签不能为空！")
    @ApiModelProperty(value = "成员类型标签" , required = true)
    private List<Integer> memberTypeList;

}