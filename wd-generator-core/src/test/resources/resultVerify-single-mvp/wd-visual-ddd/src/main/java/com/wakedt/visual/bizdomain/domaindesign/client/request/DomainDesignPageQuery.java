package com.wakedt.visual.bizdomain.domaindesign.client.request;

import com.wakedata.common.core.dto.PageQuery;
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
 * 业务域分页查询对象
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务域分页查询对象")
public class DomainDesignPageQuery extends PageQuery {

    @NotNull(message = "团队ID不能为空！")
    @ApiModelProperty(value = "团队ID", required = true)
    private Long teamId;

    @NotNull(message = "名称不能为空！")
    @ApiModelProperty(value = "名称", required = true)
    private String name;

}