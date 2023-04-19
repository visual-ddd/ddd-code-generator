package com.wakedt.visual.client.domaindesign.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 分页查询业务域版本
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "分页查询业务域版本")
public class DomainDesignVersionPageQuery extends PageQuery {

    @ApiModelProperty(value = "业务域的唯一标识")
    private String domainDesignId;

}