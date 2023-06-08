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
 * 账号所属组织信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "账号所属组织信息")
public class AccountOrganizationInfoDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "是否为组织管理员")
    private Boolean isOrganizationAdmin;

    @NotNull
    @ApiModelProperty(value = "所属组织信息")
    private OrganizationDTO organizationDTO;

}