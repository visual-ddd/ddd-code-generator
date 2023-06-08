package com.wakedt.visual.client.universallanguage.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

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

    @NotNull
    @ApiModelProperty(value = "统一语言 ID")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "概念")
    private String conception;

    @NotNull
    @ApiModelProperty(value = "英文名")
    private String englishName;

    @NotNull
    @ApiModelProperty(value = "定义")
    private String definition;

    @NotNull
    @ApiModelProperty(value = "统一语言类型")
    private Integer languageType;

    @NotNull
    @ApiModelProperty(value = "约束")
    private String restraint;

    @NotNull
    @ApiModelProperty(value = "举例")
    private String example;

    @NotNull
    @ApiModelProperty(value = "所属唯一标识")
    private Long identity;

}