package com.wakedt.visual.client.universallanguage.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 新增统一语言
 */
@Data
@ApiModel(description = "新增统一语言")
public class UniversalLanguageCreateDTO {

    @NotNull(message = "概念不能为空！")
    @ApiModelProperty(value = "概念")
    private String conception;

    @NotNull(message = "英文名不能为空！")
    @ApiModelProperty(value = "英文名")
    private String englishName;

    @NotNull(message = "定义不能为空！")
    @ApiModelProperty(value = "定义")
    private String definition;

    @NotNull(message = "统一语言类型不能为空！")
    @ApiModelProperty(value = "统一语言类型")
    private Integer languageType;

    @NotNull(message = "约束不能为空！")
    @ApiModelProperty(value = "约束")
    private String restraint;

    @NotNull(message = "举例不能为空！")
    @ApiModelProperty(value = "举例")
    private String example;

    @NotNull(message = "所属唯一标识不能为空！")
    @ApiModelProperty(value = "所属唯一标识")
    private Long identity;

}