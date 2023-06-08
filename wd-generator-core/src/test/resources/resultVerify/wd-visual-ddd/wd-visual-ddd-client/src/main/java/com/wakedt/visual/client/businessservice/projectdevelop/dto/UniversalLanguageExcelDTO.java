package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;

/**
 * 统一语言Excel数据
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "统一语言Excel数据")
public class UniversalLanguageExcelDTO extends BaseDTO {

    @NotNull
    @ApiModelProperty(value = "概念")
    private String conception;

    @NotNull
    @ApiModelProperty(value = "定义")
    private String definition;

    @NotNull
    @ApiModelProperty(value = "英文名")
    private String englishName;

    @NotNull
    @ApiModelProperty(value = "约束")
    private String restraint;

    @NotNull
    @ApiModelProperty(value = "举例")
    private String example;

}