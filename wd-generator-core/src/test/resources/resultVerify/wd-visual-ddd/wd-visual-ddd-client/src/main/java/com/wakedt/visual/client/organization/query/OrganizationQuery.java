package com.wakedt.visual.client.organization.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.organization.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 组织详情查询对象
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "组织详情查询对象")
public class OrganizationQuery extends BaseQuery {

    @ApiModelProperty(value = "组织 ID" )
    private Long id;

}