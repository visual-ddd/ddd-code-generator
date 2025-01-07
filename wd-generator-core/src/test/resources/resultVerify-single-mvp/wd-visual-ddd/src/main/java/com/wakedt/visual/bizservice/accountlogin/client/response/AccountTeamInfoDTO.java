package com.wakedt.visual.bizservice.accountlogin.client.response;

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
 * 账号所属团队信息
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "账号所属团队信息")
public class AccountTeamInfoDTO extends BaseDTO {

    @NotNull(message = "是否为团队管理员不能为空！")
    @ApiModelProperty(value = "是否为团队管理员", required = true)
    private Boolean isTeamAdmin;

    @NotNull(message = "所属团队信息不能为空！")
    @ApiModelProperty(value = "所属团队信息", required = true)
    private TeamDTO teamDTO;

}