package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 查询应用下的最新版本
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "查询应用下的最新版本")
public class ApplicationLatestVersionQuery extends BaseQuery {

    @ApiModelProperty(value = "应用ID")
    private Long id;

}