package com.wakedt.visual.client.organization.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 组织分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "组织分页查询对象")
public class OrganizationPageQuery extends PageQuery {

    @ApiModelProperty(value = "组织名称")
    private String name;

}