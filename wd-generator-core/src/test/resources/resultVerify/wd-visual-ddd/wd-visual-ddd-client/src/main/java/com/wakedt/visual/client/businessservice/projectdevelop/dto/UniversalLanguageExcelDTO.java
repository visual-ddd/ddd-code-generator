package com.wakedt.visual.client.businessservice.projectdevelop.dto;

import com.wakedata.common.core.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 统一语言Excel数据
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "统一语言Excel数据")
public class UniversalLanguageExcelDTO extends BaseDTO {

    @ApiModelProperty(value = "概念")
    private String conception;

    @ApiModelProperty(value = "定义")
    private String definition;

    @ApiModelProperty(value = "英文名")
    private String englishName;

    @ApiModelProperty(value = "约束")
    private String restraint;

    @ApiModelProperty(value = "举例")
    private String example;

}