package com.wakedt.visual.bizdomain.organization.client.request;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.organization.client.response.*;
import javax.validation.constraints.NotNull;

/**
 * 组织分页查询对象
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "组织分页查询对象")
public class OrganizationPageQuery extends PageQuery {

    @NotNull(message = "组织名称不能为空！")
    @ApiModelProperty(value = "组织名称", required = true)
    private String name;

}