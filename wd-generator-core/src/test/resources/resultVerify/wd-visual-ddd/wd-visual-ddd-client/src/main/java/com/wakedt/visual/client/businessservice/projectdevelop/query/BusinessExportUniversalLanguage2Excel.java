package com.wakedt.visual.client.businessservice.projectdevelop.query;

import com.wakedt.visual.client.businessservice.projectdevelop.dto.UniversalLanguageExcelDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 统一语言导出Excel文件(业务域)
 */
@Data
@ApiModel(value = "统一语言导出Excel文件(业务域)")
public class BusinessExportUniversalLanguage2Excel {

    @ApiModelProperty(value = "http标准响应体")
    private String response;

    @ApiModelProperty(value = "统一语言数据列表")
    private List<UniversalLanguageExcelDTO> universalLanguageList;

}