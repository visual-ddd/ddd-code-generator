package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseQuery;
import com.wakedata.common.core.dto.PageQuery;
import lombok.EqualsAndHashCode;

/**
 * 根据账号查询所属团队信息列表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "根据账号查询所属团队信息列表")
public class TeamInfoByAccountIdQuery extends BaseQuery {

    @ApiModelProperty(value = "团队成员的账号唯一标识")
    private Long accountId;

}