package com.wakedt.visual.client.businessservice.userlogin.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 账号信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "账号信息")
public class AccountDTO extends BaseDTO {

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "账号(唯一标识)")
    private String accountDTO;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "角色：1 系统管理员 2 组织管理员 3 团队管理员")
    private Integer accountRole;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "用户头像")
    private String icon;
}