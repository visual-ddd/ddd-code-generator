package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Excel导入统一语言(业务域)
 */
@Data
@ApiModel(value = "Excel导入统一语言(业务域)")
public class BusinessImportUniversallanguageFromExcel {

    @ApiModelProperty(value = "Excel文件")
    private String file;

}