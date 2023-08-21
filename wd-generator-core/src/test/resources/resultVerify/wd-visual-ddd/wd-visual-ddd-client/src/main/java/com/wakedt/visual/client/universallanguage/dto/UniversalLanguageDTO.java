package com.wakedt.visual.client.universallanguage.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;

import java.util.*;
import java.math.*;
import java.time.LocalDateTime;

/**
 * 统一语言数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "统一语言数据传输对象")
public class UniversalLanguageDTO extends BaseDTO {

    @NotNull(message = "统一语言 ID不能为空！")
    @ApiModelProperty(value = "统一语言 ID" , required = true)
    private Long id;

    @NotNull(message = "概念不能为空！")
    @ApiModelProperty(value = "概念" , required = true)
    private String conception;

    @NotNull(message = "英文名不能为空！")
    @ApiModelProperty(value = "英文名" , required = true)
    private String englishName;

    @NotNull(message = "定义不能为空！")
    @ApiModelProperty(value = "定义" , required = true)
    private String definition;

    @NotNull(message = "统一语言类型不能为空！")
    @ApiModelProperty(value = "统一语言类型" , required = true)
    private Integer languageType;

    @NotNull(message = "约束不能为空！")
    @ApiModelProperty(value = "约束" , required = true)
    private String restraint;

    @NotNull(message = "举例不能为空！")
    @ApiModelProperty(value = "举例" , required = true)
    private String example;

    @NotNull(message = "所属唯一标识不能为空！")
    @ApiModelProperty(value = "所属唯一标识" , required = true)
    private Long identity;

}