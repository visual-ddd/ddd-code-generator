package com.wakedt.visual.application.client.query;

import com.wakedata.common.core.dto.PageQuery;
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
 * 应用列表查询对象
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:47
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用列表查询对象")
public class ApplicationListQuery extends PageQuery {

    @NotNull(message = "应用的唯一标识列表不能为空！")
    @ApiModelProperty(value = "应用的唯一标识列表" , required = true)
    private List<Long> idList;

}