package com.wakedt.visual.client.businessscene.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 应用最新版本查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "应用最新版本查询对象")
public class BusinessSceneLatestVersionQuery extends BaseQuery {

    @ApiModelProperty(value = "业务场景ID")
    private Long id;

}