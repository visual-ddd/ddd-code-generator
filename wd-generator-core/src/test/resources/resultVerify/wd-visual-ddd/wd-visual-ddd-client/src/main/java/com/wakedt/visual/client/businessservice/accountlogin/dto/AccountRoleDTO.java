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
@ApiModel(description = "当前登录账号权限")
public class AccountRoleDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "账号ID")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "账号(唯一标识)")
    private String accountNo;

    @NotNull
    @ApiModelProperty(value = "所属团队信息列表")
    private List<AccountTeamInfoDTO> teamDTOList;

    @NotNull
    @ApiModelProperty(value = "所属组织信息列表")
    private List<AccountOrganizationInfoDTO> accountOrganizationInfoList;

}