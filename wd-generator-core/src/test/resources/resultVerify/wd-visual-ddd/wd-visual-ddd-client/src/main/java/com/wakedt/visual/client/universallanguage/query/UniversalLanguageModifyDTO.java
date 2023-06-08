package com.wakedt.visual.client.universallanguage.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;

/**
 * 编辑统一语言
 */
@Data
@ApiModel(description = "编辑统一语言")
public class UniversalLanguageModifyDTO {

    @NotNull
    @ApiModelProperty(value = "统一语言 ID")
    public Long id;

    @NotNull
    @ApiModelProperty(value = "概念")
    public String conception;

    @NotNull
    @ApiModelProperty(value = "英文名")
    public String englishName;

    @NotNull
    @ApiModelProperty(value = "定义")
    public String definition;

    @NotNull
    @ApiModelProperty(value = "约束")
    public String restraint;

    @NotNull
    @ApiModelProperty(value = "举例")
    public String example;

    @NotNull
    @ApiModelProperty(value = "所属唯一标识")
    public Long identity;

}