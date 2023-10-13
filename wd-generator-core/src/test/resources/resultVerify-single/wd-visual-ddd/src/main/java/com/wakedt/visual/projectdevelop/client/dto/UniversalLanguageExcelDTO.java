package com.wakedt.visual.projectdevelop.client.dto;

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
 *
 * @author visual-ddd
 * @since 1.0 on 2023-10-13 18:17:49
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "统一语言Excel数据")
public class UniversalLanguageExcelDTO extends BaseDTO {

    @NotNull(message = "概念不能为空！")
    @ApiModelProperty(value = "概念" , required = true)
    private String conception;

    @NotNull(message = "定义不能为空！")
    @ApiModelProperty(value = "定义" , required = true)
    private String definition;

    @NotNull(message = "英文名不能为空！")
    @ApiModelProperty(value = "英文名" , required = true)
    private String englishName;

    @NotNull(message = "约束不能为空！")
    @ApiModelProperty(value = "约束" , required = true)
    private String restraint;

    @NotNull(message = "举例不能为空！")
    @ApiModelProperty(value = "举例" , required = true)
    private String example;

}