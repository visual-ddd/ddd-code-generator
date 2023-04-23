package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.*;

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