package com.wakedt.visual.client.businessservice.accountlogin.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;

/**
 * 当前登录账号权限
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "当前登录账号权限")
public class AccountRoleDTO extends BaseDTO {

    @NotNull(message = "账号ID不能为空！")
    @ApiModelProperty(value = "账号ID")
    private Long id;

    @NotNull(message = "账号(唯一标识)不能为空！")
    @ApiModelProperty(value = "账号(唯一标识)")
    private String accountNo;

    @NotNull(message = "所属团队信息列表不能为空！")
    @ApiModelProperty(value = "所属团队信息列表")
    private List<AccountTeamInfoDTO> teamDTOList;

    @NotNull(message = "所属组织信息列表不能为空！")
    @ApiModelProperty(value = "所属组织信息列表")
    private List<AccountOrganizationInfoDTO> accountOrganizationInfoList;

}