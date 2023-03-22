package com.wakedt.visual.client.organization.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 用于团队成员的数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用于团队成员的数据传输对象")
public class TeamMemberDTO extends BaseDTO {

    @ApiModelProperty(value = "团队成员ID")
    private Long id;

    @ApiModelProperty(value = "团队唯一标识")
    private Long teamId;

    @ApiModelProperty(value = "团队成员的账号唯一标识")
    private Long accountId;

    @ApiModelProperty(value = "成员类型标签")
    private List<Integer> memberTypeList;

    @ApiModelProperty(value = "成员名称")
    private String teamMemberName;

}