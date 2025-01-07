package com.wakedt.visual.bizdomain.application.client.request;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.application.client.response.*;
import javax.validation.constraints.NotNull;

/**
 * 应用版本分页查询对象
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用版本分页查询对象")
public class ApplicationVersionPageQuery extends PageQuery {

    @NotNull(message = "应用ID不能为空！")
    @ApiModelProperty(value = "应用ID", required = true)
    private String applicationId;

}