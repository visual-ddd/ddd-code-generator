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
 * 账号所属组织信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "账号所属组织信息")
public class AccountOrganizationInfoDTO extends BaseDTO {

    @NotNull(message = "是否为组织管理员不能为空！")
    @ApiModelProperty(value = "是否为组织管理员" , required = true)
    private Boolean isOrganizationAdmin;

    @NotNull(message = "所属组织信息不能为空！")
    @ApiModelProperty(value = "所属组织信息" , required = true)
    private OrganizationDTO organizationDTO;

}