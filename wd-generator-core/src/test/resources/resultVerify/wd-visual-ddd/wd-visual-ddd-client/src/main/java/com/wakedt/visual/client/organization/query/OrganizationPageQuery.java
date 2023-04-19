package com.wakedt.visual.client.organization.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

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