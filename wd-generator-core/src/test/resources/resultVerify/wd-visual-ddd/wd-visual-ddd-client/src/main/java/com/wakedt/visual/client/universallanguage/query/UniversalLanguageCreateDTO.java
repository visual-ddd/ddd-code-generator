package com.wakedt.visual.client.universallanguage.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 新增统一语言
 */
@Data
@ApiModel(description = "新增统一语言")
public class UniversalLanguageCreateDTO {

    @ApiModelProperty(value = "概念")
    public String conception;

    @ApiModelProperty(value = "英文名")
    public String englishName;

    @ApiModelProperty(value = "定义")
    public String definition;

    @ApiModelProperty(value = "统一语言类型")
    public Integer languageType;

    @ApiModelProperty(value = "约束")
    public String restraint;

    @ApiModelProperty(value = "举例")
    public String example;

    @ApiModelProperty(value = "所属唯一标识")
    public Long identity;

}