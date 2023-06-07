package com.wakedt.visual.client.organization.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 团队成员数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "团队成员数据传输对象")
public class TeamMemberDTO extends BaseDTO {

    @ApiModelProperty(value = "团队成员ID")
    private Long id;

    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @ApiModelProperty(value = "成员账号ID")
    private Long accountId;

    @ApiModelProperty(value = "成员类型标签")
    private List<Integer> memberTypeList;

}