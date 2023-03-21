package com.wakedt.visual.client.organization.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 用于团队的数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用于团队的数据传输对象")
public class TeamDTO extends BaseDTO {

    @ApiModelProperty(value = "团队ID")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "组织唯一标识")
    private Long organizationId;

    @ApiModelProperty(value = "所属组织信息")
    private OrganizationDTO organizationDTO;

    @ApiModelProperty(value = "团队的管理者，被组织管理员授权，管理自己所在团队")
    private Long teamManagerId;

    @ApiModelProperty(value = "团队管理员名称")
    private String teamManagerName;
}