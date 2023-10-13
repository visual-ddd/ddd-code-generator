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
 * 应用最新版本查询对象
 *
 * @author shimmer
 * @since 1.0 on 2023-10-13 18:12:52
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "应用最新版本查询对象")
public class BusinessSceneLatestVersionQuery extends BaseQuery {

    @NotNull(message = "业务场景ID不能为空！")
    @ApiModelProperty(value = "业务场景ID" , required = true)
    private Long id;

}