package com.wakedt.visual.client.businessservice.projectdevelop.query;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.math.*;
import java.time.LocalDateTime;
import com.wakedt.visual.client.businessservice.projectdevelop.dto.*;
import javax.validation.constraints.NotNull;

/**
 * 统一语言导出Excel文件(业务域)
 */
@Data
@ApiModel(description = "统一语言导出Excel文件(业务域)")
public class BusinessExportUniversalLanguage2Excel {

    @NotNull
    @ApiModelProperty(value = "http标准响应体")
    private String response;

    @NotNull
    @ApiModelProperty(value = "统一语言数据列表")
    private List<UniversalLanguageExcelDTO> universalLanguageList;

}