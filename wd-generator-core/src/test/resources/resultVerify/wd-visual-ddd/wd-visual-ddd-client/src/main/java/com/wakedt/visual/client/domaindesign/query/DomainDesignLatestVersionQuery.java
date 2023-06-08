package com.wakedt.visual.client.domaindesign.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.domaindesign.dto.*;

/**
 * 业务域最新版本查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域最新版本查询对象")
public class DomainDesignLatestVersionQuery extends BaseQuery {

    @ApiModelProperty(value = "业务域ID")
    private Long id;

}