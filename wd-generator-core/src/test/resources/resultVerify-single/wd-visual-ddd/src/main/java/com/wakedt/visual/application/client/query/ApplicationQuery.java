package com.wakedt.visual.application.client.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.application.client.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 应用详情查询对象
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用详情查询对象")
public class ApplicationQuery extends BaseQuery {

    @NotNull(message = "应用 ID不能为空！")
    @ApiModelProperty(value = "应用 ID" , required = true)
    private Long id;

}