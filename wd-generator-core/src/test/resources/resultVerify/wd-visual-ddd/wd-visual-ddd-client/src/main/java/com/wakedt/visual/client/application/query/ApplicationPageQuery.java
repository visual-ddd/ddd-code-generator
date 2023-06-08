package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.application.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 应用分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用分页查询对象")
public class ApplicationPageQuery extends PageQuery {

    @NotNull
    @ApiModelProperty(value = "团队ID")
    private Long teamId;

    @NotNull
    @ApiModelProperty(value = "名称")
    private String name;

}