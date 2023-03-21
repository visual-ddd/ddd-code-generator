package com.wakedt.visual.client.organization.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import com.wakedata.common.core.base.BaseQuery;
import com.wakedata.common.core.dto.PageQuery;
import lombok.EqualsAndHashCode;

/**
 * 分页查询组织
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "分页查询组织")
public class OrganizationPageQuery extends PageQuery {

    @ApiModelProperty(value = "组织名称")
    private String name;
}