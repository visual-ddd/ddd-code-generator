package com.wakedt.visual.client.domaindesign.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 查询业务域下的最新版本
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "查询业务域下的最新版本")
public class DomainDesignLatestVersionQuery extends BaseQuery {

    @ApiModelProperty(value = "业务域ID")
    private Long id;

}