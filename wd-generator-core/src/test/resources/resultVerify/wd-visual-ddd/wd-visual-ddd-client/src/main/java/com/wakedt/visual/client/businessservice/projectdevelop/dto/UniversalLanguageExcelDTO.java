package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedata.common.core.base.BaseDTO;
import lombok.EqualsAndHashCode;
import javax.validation.constraints.NotNull;

/**
 * 统一语言Excel数据
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "统一语言Excel数据")
public class UniversalLanguageExcelDTO extends BaseDTO {

    @NotNull(message = "概念不能为空！")
    @ApiModelProperty(value = "概念")
    private String conception;

    @NotNull(message = "定义不能为空！")
    @ApiModelProperty(value = "定义")
    private String definition;

    @NotNull(message = "英文名不能为空！")
    @ApiModelProperty(value = "英文名")
    private String englishName;

    @NotNull(message = "约束不能为空！")
    @ApiModelProperty(value = "约束")
    private String restraint;

    @NotNull(message = "举例不能为空！")
    @ApiModelProperty(value = "举例")
    private String example;

}