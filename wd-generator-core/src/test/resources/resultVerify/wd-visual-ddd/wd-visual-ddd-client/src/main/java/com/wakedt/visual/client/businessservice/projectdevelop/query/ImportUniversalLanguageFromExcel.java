package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Excel导入统一语言
 */
@Data
@ApiModel(value = "Excel导入统一语言")
public class ImportUniversalLanguageFromExcel {

    @ApiModelProperty(value = "Excel文件")
    private String file;

    @ApiModelProperty(value = "统一语言类型：1-组织统一语言，2-团队统一语言，3-业务域统一语言")
    private Integer languageType;

    @ApiModelProperty(value = "所属唯一标识(组织/团队的主键id)")
    private Long identity;

}