package com.wakedt.visual.client.universallanguage.query;

import com.wakedata.common.core.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 查询统一语言详情
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "查询统一语言详情")
public class UniversalLanguageQuery extends BaseQuery {

    @ApiModelProperty(value = "统一语言 ID")
    private Long id;

}