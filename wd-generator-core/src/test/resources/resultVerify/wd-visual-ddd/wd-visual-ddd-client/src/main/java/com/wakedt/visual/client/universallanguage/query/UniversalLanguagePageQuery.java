package com.wakedt.visual.client.universallanguage.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 统一语言分页查询对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "统一语言分页查询对象")
public class UniversalLanguagePageQuery extends PageQuery {

    @ApiModelProperty(value = "概念")
    private String conception;

    @ApiModelProperty(value = "统一语言类型")
    private String languageType;

    @ApiModelProperty(value = "所属唯一标识")
    private Long identity;

}