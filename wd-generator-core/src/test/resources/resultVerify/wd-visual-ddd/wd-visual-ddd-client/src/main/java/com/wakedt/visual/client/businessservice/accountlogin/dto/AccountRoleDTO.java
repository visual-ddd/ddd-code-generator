package com.wakedt.visual.client.businessservice.accountlogin.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 当前登录账号权限
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "当前登录账号权限")
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