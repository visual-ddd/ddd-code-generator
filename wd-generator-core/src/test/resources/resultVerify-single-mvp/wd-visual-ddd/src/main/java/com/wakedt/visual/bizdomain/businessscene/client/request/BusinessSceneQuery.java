package com.wakedt.visual.bizdomain.businessscene.client.request;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.businessscene.client.response.*;
import javax.validation.constraints.NotNull;

/**
 * 业务场景详情查询对象
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景详情查询对象")
public class BusinessSceneQuery extends BaseQuery {

    @NotNull(message = "业务场景 ID不能为空！")
    @ApiModelProperty(value = "业务场景 ID", required = true)
    private Long id;

}