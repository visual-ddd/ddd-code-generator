package com.wakedt.visual.client.application.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import com.wakedt.visual.client.application.dto.*;

/**
 * 应用版本分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "应用版本分页查询对象")
public class ApplicationVersionPageQuery extends PageQuery {

    @ApiModelProperty(value = "应用ID")
    private String applicationId;

}