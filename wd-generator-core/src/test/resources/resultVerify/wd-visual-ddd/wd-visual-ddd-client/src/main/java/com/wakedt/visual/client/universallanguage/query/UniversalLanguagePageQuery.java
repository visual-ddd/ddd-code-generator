package com.wakedt.visual.client.universallanguage.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;

/**
 * 分页查询统一语言
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "分页查询统一语言")
public class UniversalLanguagePageQuery extends PageQuery {

    @ApiModelProperty(value = "概念")
    private String conception;

    @ApiModelProperty(value = "统一语言的类型")
    private String languageType;

    @ApiModelProperty(value = "所属唯一标识(组织/团队的主键id)")
    private Long identity;

}