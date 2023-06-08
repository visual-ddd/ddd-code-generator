package com.wakedt.visual.client.businessscene.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.businessscene.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 业务场景详情查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "业务场景详情查询对象")
public class BusinessSceneQuery extends BaseQuery {

    @NotNull
    @ApiModelProperty(value = "业务场景 ID")
    private Long id;

}