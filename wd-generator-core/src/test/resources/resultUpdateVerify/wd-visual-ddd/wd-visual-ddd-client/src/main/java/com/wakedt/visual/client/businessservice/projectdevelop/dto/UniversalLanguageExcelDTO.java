package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * 统一语言Excel数据
 *
 * @author shimmer
 * @since 1.0
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