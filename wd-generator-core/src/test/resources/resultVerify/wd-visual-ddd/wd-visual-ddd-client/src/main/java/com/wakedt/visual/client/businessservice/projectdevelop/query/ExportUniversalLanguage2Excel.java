package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * 统一语言导出Excel文件
 */
@Data
@ApiModel(value = "统一语言导出Excel文件")
public class ExportUniversalLanguage2Excel {

    @ApiModelProperty(value = "http标准响应体")
    private String response;

    @ApiModelProperty(value = "概念")
    private String conception;

    @ApiModelProperty(value = "统一语言类型：1-组织统一语言，2-团队统一语言，3-业务域统一语言")
    private Integer languageType;

    @ApiModelProperty(value = "所属唯一标识(组织/团队的主键id)")
    private Long identity;

}