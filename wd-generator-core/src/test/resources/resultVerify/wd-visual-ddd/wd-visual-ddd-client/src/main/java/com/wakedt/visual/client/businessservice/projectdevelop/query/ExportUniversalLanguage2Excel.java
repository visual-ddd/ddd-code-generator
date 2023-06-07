package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 统一语言导出Excel文件
 */
@Data
@ApiModel(description = "统一语言导出Excel文件")
public class ExportUniversalLanguage2Excel {

    @ApiModelProperty(value = "http标准响应体")
    private String response;

    @ApiModelProperty(value = "概念")
    private String conception;

    @ApiModelProperty(value = "统一语言类型")
    private Integer languageType;

    @ApiModelProperty(value = "所属唯一标识")
    private Long identity;

}