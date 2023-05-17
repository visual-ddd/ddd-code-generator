package com.wakedt.visual.client.account.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 账号分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "账号分页查询对象")
public class AccountPageQuery extends PageQuery {

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "所属组织ID")
    private String organizationId;

    @ApiModelProperty(value = "所属团队ID")
    private String teamId;

}