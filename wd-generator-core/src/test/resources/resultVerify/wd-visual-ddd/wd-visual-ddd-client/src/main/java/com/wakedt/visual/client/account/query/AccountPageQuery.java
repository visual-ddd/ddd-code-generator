package com.wakedt.visual.client.account.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 分页查询账号
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "分页查询账号")
public class AccountPageQuery extends PageQuery {

    @ApiModelProperty(value = "用户设置的名称标识")
    private String userName;

    @ApiModelProperty(value = "当前用户所属组织的唯一标识")
    private String organizationId;

    @ApiModelProperty(value = "当前用户所属团队的唯一标识")
    private String teamId;

}