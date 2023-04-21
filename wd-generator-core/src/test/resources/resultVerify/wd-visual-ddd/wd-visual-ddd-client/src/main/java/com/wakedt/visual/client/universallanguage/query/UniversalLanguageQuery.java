package com.wakedt.visual.client.universallanguage.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 统一语言详情查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "统一语言详情查询对象")
public class UniversalLanguageQuery extends BaseQuery {

    @ApiModelProperty(value = "统一语言 ID")
    private Long id;

}