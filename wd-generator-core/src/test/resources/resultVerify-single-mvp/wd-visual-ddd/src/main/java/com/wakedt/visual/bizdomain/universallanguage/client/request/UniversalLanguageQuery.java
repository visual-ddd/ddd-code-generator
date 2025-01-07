package com.wakedt.visual.bizdomain.universallanguage.client.request;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.bizdomain.universallanguage.client.response.*;
import javax.validation.constraints.NotNull;

/**
 * 统一语言详情查询对象
 *
 * @author visual-ddd
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "统一语言详情查询对象")
public class UniversalLanguageQuery extends BaseQuery {

    @NotNull(message = "统一语言 ID不能为空！")
    @ApiModelProperty(value = "统一语言 ID", required = true)
    private Long id;

}