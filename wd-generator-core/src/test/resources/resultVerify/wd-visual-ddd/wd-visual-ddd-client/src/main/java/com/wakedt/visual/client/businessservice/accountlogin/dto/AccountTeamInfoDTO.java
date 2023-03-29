package com.wakedt.visual.client.businessservice.accountlogin.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 账号所属团队信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "账号所属团队信息")
public class AccountTeamInfoDTO extends BaseDTO {

    @ApiModelProperty(value = "是否为团队管理员")
    private Boolean isTeamAdmin;

    @ApiModelProperty(value = "所属团队信息")
    private TeamDTO teamDTO;

}