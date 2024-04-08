package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 应用列表查询对象
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用列表查询对象")
public class ApplicationListQuery extends PageQuery {

    @NotNull(message = "应用的唯一标识列表不能为空！")
    @ApiModelProperty(value = "应用的唯一标识列表", required = true)
    private List<Long> idList;

}