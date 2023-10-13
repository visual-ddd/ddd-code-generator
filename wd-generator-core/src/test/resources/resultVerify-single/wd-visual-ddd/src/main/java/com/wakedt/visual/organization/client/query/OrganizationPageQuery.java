package com.wakedt.visual.organization.client.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.organization.client.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 组织分页查询对象
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "组织分页查询对象")
public class OrganizationPageQuery extends PageQuery {

    @NotNull(message = "组织名称不能为空！")
    @ApiModelProperty(value = "组织名称" , required = true)
    private String name;

}