package com.wakedt.visual.client.domaindesign.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.domaindesign.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 业务域版本详情查询对象
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 19:59:41
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域版本详情查询对象")
public class DomainDesignVersionQuery extends BaseQuery {

    @NotNull(message = "业务域版本ID不能为空！")
    @ApiModelProperty(value = "业务域版本ID" , required = true)
    private Long id;

}