package com.wakedt.visual.universallanguage.client.query;

import com.wakedata.common.core.dto.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.universallanguage.client.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 统一语言分页查询对象
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 19:59:55
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "统一语言分页查询对象")
public class UniversalLanguagePageQuery extends PageQuery {

    @NotNull(message = "概念不能为空！")
    @ApiModelProperty(value = "概念" , required = true)
    private String conception;

    @NotNull(message = "统一语言类型不能为空！")
    @ApiModelProperty(value = "统一语言类型" , required = true)
    private String languageType;

    @NotNull(message = "所属唯一标识不能为空！")
    @ApiModelProperty(value = "所属唯一标识" , required = true)
    private Long identity;

}