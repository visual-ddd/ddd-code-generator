package com.wakedt.visual.bizdomain.domaindesign.client.request;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.domaindesign.client.response.*;
import javax.validation.constraints.NotNull;

/**
 * 业务域版本详情查询对象
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域版本详情查询对象")
public class DomainDesignVersionQuery extends BaseQuery {

    @NotNull(message = "业务域版本ID不能为空！")
    @ApiModelProperty(value = "业务域版本ID", required = true)
    private Long id;

}