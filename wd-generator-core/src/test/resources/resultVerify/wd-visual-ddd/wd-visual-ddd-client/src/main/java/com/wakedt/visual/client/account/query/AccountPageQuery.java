package com.wakedt.visual.client.account.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.account.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 账号分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "账号分页查询对象")
public class AccountPageQuery extends PageQuery {

    @NotNull(message = "用户名不能为空！")
    @ApiModelProperty(value = "用户名")
    private String userName;

    @NotNull(message = "所属组织ID不能为空！")
    @ApiModelProperty(value = "所属组织ID")
    private String organizationId;

    @NotNull(message = "所属团队ID不能为空！")
    @ApiModelProperty(value = "所属团队ID")
    private String teamId;

}