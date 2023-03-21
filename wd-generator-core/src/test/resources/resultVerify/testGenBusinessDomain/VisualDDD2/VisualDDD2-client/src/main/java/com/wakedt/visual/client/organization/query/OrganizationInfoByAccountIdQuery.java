package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseQuery;
import com.wakedata.common.core.dto.PageQuery;
import lombok.EqualsAndHashCode;

/**
 * 根据用户查询关联的组织信息列表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "根据用户查询关联的组织信息列表")
public class OrganizationInfoByAccountIdQuery extends BaseQuery {

    @ApiModelProperty(value = "团队成员的账号唯一标识")
    private Long accountId;
}