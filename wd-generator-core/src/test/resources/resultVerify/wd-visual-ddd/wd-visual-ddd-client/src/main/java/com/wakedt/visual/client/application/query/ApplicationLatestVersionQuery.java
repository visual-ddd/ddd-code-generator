package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.base.BaseQuery;
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
 * 应用最新版本查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用最新版本查询对象")
public class ApplicationLatestVersionQuery extends BaseQuery {

    @NotNull
    @ApiModelProperty(value = "应用ID")
    private Long id;

}