package com.wakedt.visual.client.businessservice.accountlogin.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 团队信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "团队信息")
public class TeamDTO extends BaseDTO {

    @ApiModelProperty(value = "团队ID")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "团队管理员")
    private String teamManagerId;

    @ApiModelProperty(value = "组织唯一标识")
    private String organizationId;

}