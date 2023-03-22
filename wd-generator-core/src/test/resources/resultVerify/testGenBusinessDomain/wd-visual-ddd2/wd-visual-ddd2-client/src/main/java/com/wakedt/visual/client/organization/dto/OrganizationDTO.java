package com.wakedt.visual.client.organization.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 用于组织的数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用于组织的数据传输对象")
public class OrganizationDTO extends BaseDTO {

    @ApiModelProperty(value = "组织 ID")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String descritption;

    @ApiModelProperty(value = "组织的管理者，被系统管理员授权，管理自己所在组织下的所有团队。")
    private Long organizationTeamManagerId;

    @ApiModelProperty(value = "组织管理员名称(账号名称)")
    private String organizationManagerName;

}