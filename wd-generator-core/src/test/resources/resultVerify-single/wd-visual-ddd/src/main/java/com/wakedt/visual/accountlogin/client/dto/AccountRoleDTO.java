package com.wakedt.visual.accountlogin.client.dto;

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
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:57
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "当前登录账号权限")
public class AccountRoleDTO extends BaseDTO {

    @NotNull(message = "账号ID不能为空！")
    @ApiModelProperty(value = "账号ID" , required = true)
    private Long id;

    @NotNull(message = "账号(唯一标识)不能为空！")
    @ApiModelProperty(value = "账号(唯一标识)" , required = true)
    private String accountNo;

    @NotNull(message = "所属团队信息列表不能为空！")
    @ApiModelProperty(value = "所属团队信息列表" , required = true)
    private List<AccountTeamInfoDTO> teamDTOList;

    @NotNull(message = "所属组织信息列表不能为空！")
    @ApiModelProperty(value = "所属组织信息列表" , required = true)
    private List<AccountOrganizationInfoDTO> accountOrganizationInfoList;

}