package com.wakedt.visual.client.businessservice.projectdevelop.query;

import com.wakedt.visual.client.businessservice.projectdevelop.dto.UniversalLanguageExcelDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 统一语言导出Excel文件(业务域)
 *
 * @author shimmer
 * @since 1.0
 */
@Data
@ApiModel(description = "统一语言导出Excel文件(业务域)")
public class BusinessExportUniversalLanguage2Excel {

    @NotNull(message = "http标准响应体不能为空！")
    @ApiModelProperty(value = "http标准响应体" , required = true)
    private String response;

    @NotNull(message = "统一语言数据列表不能为空！")
    @ApiModelProperty(value = "统一语言数据列表" , required = true)
    private List<UniversalLanguageExcelDTO> universalLanguageList;

}