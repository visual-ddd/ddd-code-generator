package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 分页查询应用版本
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "分页查询应用版本")
public class ApplicationVersionPageQuery extends PageQuery {

    @ApiModelProperty(value = "应用的唯一标识")
    private String applicationId;

}