package com.wakedt.visual.client.businessservice.accountlogin.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 当前登录账号权限
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "当前登录账号权限")
public class AccountRoleDTO extends BaseDTO {

    @ApiModelProperty(value = "账号ID")
    private Long id;

    @ApiModelProperty(value = "账号(唯一标识)")
    private String accountNo;

    @ApiModelProperty(value = "所属团队信息列表")
    private List<AccountTeamInfoDTO> teamDTOList;

    @ApiModelProperty(value = "所属组织信息列表")
    private List<AccountOrganizationInfoDTO> accountOrganizationInfoList;

}