package com.wakedt.visual.client.businessservice.accountlogin.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 账号所属组织信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "账号所属组织信息")
public class AccountOrganizationInfoDTO extends BaseDTO {

    @ApiModelProperty(value = "是否为组织管理员")
    private Boolean isOrganizationAdmin;

    @ApiModelProperty(value = "所属组织信息")
    private OrganizationDTO organizationDTO;

}